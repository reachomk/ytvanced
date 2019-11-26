package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: acgw */
public final class acgw extends achc implements acha, achb {
    private final acgy f;
    private boolean g;
    private boolean h;
    private int i;

    public acgw(MediaFormat mediaFormat, acgy acgy, achr achr) {
        super(mediaFormat, achr);
        this.f = acgy;
        this.f.a((acha) this);
        this.f.a((achb) this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        this.g = true;
        this.f.b();
    }

    public final boolean b() {
        if (this.f.a()) {
            return super.b();
        }
        Log.e("DefaultAudioEncoder", "Failed to ensure audio input was started");
        return false;
    }

    public final boolean c() {
        if (!this.f.b()) {
            Log.w("DefaultAudioEncoder", "Error stopping audio encoder");
        }
        return super.c();
    }

    public final boolean d() {
        int i = this.i;
        String str = "DefaultAudioEncoder";
        if (i > 0) {
            StringBuilder stringBuilder = new StringBuilder(68);
            stringBuilder.append("Buffers still pending from audio input at release: count=");
            stringBuilder.append(i);
            Log.w(str, stringBuilder.toString());
        }
        if (!this.f.c()) {
            Log.w(str, "Error releasing audio input");
        }
        return super.d();
    }

    public final void a(int i) {
        Log.w("DefaultAudioEncoder", "Changing bitrate for audio not supported.");
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        xak.b();
        String str = "DefaultAudioEncoder";
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(46);
            stringBuilder.append("Unexpected buffer index for codec: ");
            stringBuilder.append(i);
            Log.e(str, stringBuilder.toString());
            return;
        }
        try {
            ByteBuffer inputBuffer = this.b.getInputBuffer(i);
            if (inputBuffer == null) {
                Log.e(str, "Got a null buffer valid buffer should be present");
                return;
            }
            this.i++;
            this.f.a(i, inputBuffer);
        } catch (Exception e) {
            Log.e(str, "Error obtaining input buffer for audio encoder", e);
            if (!this.g) {
                c(7);
            }
        }
    }

    public final void a(int i, int i2, int i3, long j) {
        int i4 = i3;
        this.i--;
        String str = "DefaultAudioEncoder";
        if (i4 >= 0) {
            try {
                if (!this.h) {
                    if (f()) {
                        boolean z = false;
                        this.b.queueInputBuffer(i, 0, this.e != 3 ? i4 : 0, j, i2);
                        if ((i2 & 4) != 0) {
                            z = true;
                        }
                        this.h = z;
                        if (z && !this.g) {
                            Log.e(str, "Unexpected EOS from audio data");
                            c(7);
                            return;
                        }
                    }
                }
                StringBuilder stringBuilder = new StringBuilder(60);
                stringBuilder.append("Received full buffer after sending end: bufferId=");
                int i5 = i;
                stringBuilder.append(i);
                Log.e(str, stringBuilder.toString());
            } catch (Exception e) {
                Log.e(str, "Error queuing input to audio encoder", e);
                c(7);
            }
        } else if (!this.g) {
            StringBuilder stringBuilder2 = new StringBuilder(37);
            stringBuilder2.append("Error reading audio data: ");
            stringBuilder2.append(i4);
            Log.e(str, stringBuilder2.toString());
            c(7);
        }
    }

    public final void b(int i) {
        c(i);
    }
}
