package defpackage;

import android.media.AudioRecord;
import android.media.audiofx.NoiseSuppressor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: zgm */
public final class zgm implements Runnable {
    public AudioRecord a;
    public Thread b;
    public zgl c;
    public boolean d;
    public NoiseSuppressor e;
    private final int f;
    private final int g;

    public zgm(int i, int i2) {
        boolean z = i2 == 1 || i2 == 2;
        amqw.a(z);
        this.f = 44100;
        this.g = i2;
        int i3 = i2 == 1 ? 16 : 12;
        this.a = new AudioRecord(i, 44100, i3, 2, Math.max((i2 + i2) << 14, AudioRecord.getMinBufferSize(44100, i3, 2)));
        if (NoiseSuppressor.isAvailable()) {
            try {
                this.e = NoiseSuppressor.create(this.a.getAudioSessionId());
                NoiseSuppressor noiseSuppressor = this.e;
                if (!(noiseSuppressor == null || noiseSuppressor.setEnabled(true) == 0)) {
                    xtl.c("Failed to enable noise suppressor.");
                    this.e.release();
                    this.e = null;
                }
            } catch (Exception e) {
                afpf afpf = afpf.media;
                String str = "youtubeAudioCapture: Exception while creating noise suppressor - ";
                String name = e.getClass().getName();
                if (name.length() == 0) {
                    name = new String(str);
                } else {
                    name = str.concat(name);
                }
                afpc.a(1, afpf, name);
                this.e.release();
                this.e = null;
            }
        }
    }

    public final long a(long j) {
        int i = this.g;
        double d = (double) (j / ((long) (i + i)));
        Double.isNaN(d);
        d *= 1000000.0d;
        double d2 = (double) this.f;
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    public final void run() {
        int i = this.g;
        i = (i + i) << 10;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1024);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        while (!this.d) {
            int read = this.a.read(allocateDirect, i);
            if (read > 0) {
                allocateDirect.clear();
                allocateDirect.limit(read);
                this.c.a(allocateDirect);
            }
        }
        this.a.stop();
    }
}
