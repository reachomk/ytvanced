package defpackage;

import android.content.Context;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.nio.ByteBuffer;

/* renamed from: achg */
public final class achg implements achr {
    private final MediaMuxer a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private long f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;

    public achg(String str, boolean z) {
        str = String.valueOf(str);
        String str2 = ".mp4";
        if (str2.length() == 0) {
            str2 = new String(str);
        } else {
            str2 = str.concat(str2);
        }
        this.b = str2;
        this.c = true;
        this.d = true;
        this.e = z;
        this.a = new MediaMuxer(this.b, 0);
    }

    public final void a(int i) {
    }

    public final void a(achq achq) {
    }

    public final int g() {
        return -1;
    }

    public final Pair h() {
        return null;
    }

    public final int a(MediaFormat mediaFormat) {
        String str = "FileMuxer";
        if (this.j) {
            Log.e(str, "Cannot add a track once started");
            return -1;
        } else if (this.k) {
            Log.e(str, "Cannot add a track once stopped");
            return -1;
        } else if (this.l) {
            Log.e(str, "Cannot add a track after release");
            return -1;
        } else {
            try {
                int addTrack = this.a.addTrack(mediaFormat);
                if (acej.a(mediaFormat)) {
                    this.g = true;
                } else if (acej.b(mediaFormat)) {
                    this.h = true;
                }
                return addTrack;
            } catch (Exception unused) {
                String valueOf = String.valueOf(mediaFormat);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 32);
                stringBuilder.append("Adding track failed for format: ");
                stringBuilder.append(valueOf);
                Log.e(str, stringBuilder.toString());
                return -1;
            }
        }
    }

    public final boolean a() {
        boolean z = false;
        if (!(this.l || this.k || (this.d && !this.h))) {
            if (this.c) {
                return !this.g ? z : true;
            } else {
                z = true;
            }
        }
    }

    public final boolean b() {
        if (this.l) {
            return true;
        }
        try {
            this.a.release();
            this.l = true;
        } catch (Exception e) {
            Log.e("FileMuxer", "Releasing media muxer failed", e);
        }
        return this.l;
    }

    public final int c() {
        String str = "FileMuxer";
        if (this.l) {
            Log.e(str, "Cannot prepare once released");
            return 1;
        } else if (this.k) {
            Log.e(str, "Cannot prepare once stopped");
            return 1;
        } else if (this.j) {
            Log.e(str, "Cannot prepare once started");
            return 1;
        } else {
            this.f = 0;
            this.i = true;
            return 0;
        }
    }

    public final boolean d() {
        String str = "FileMuxer";
        if (this.l) {
            Log.e(str, "Cannot start once released");
            return false;
        } else if (this.k) {
            Log.e(str, "Cannot restart once stopped");
            return false;
        } else if (!this.i) {
            Log.e(str, "Muxer not prepared");
            return false;
        } else if (this.j) {
            return true;
        } else {
            if (a()) {
                try {
                    this.a.start();
                    this.j = true;
                } catch (Exception e) {
                    Log.e(str, "Starting muxer failed", e);
                }
                return this.j;
            }
            Log.e(str, "Cannot start without all tracks");
            return false;
        }
    }

    public final boolean e() {
        String str = "FileMuxer";
        if (this.l) {
            Log.e(str, "Cannot stop once released");
            return false;
        } else if (!this.j) {
            Log.e(str, "Muxer not started");
            return false;
        } else if (this.k) {
            return true;
        } else {
            try {
                this.a.stop();
                this.k = true;
            } catch (Exception unused) {
                String valueOf = String.valueOf(this.b);
                String str2 = "Muxer not stopped cleanly. Deleting media file: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                Log.e(str, valueOf);
                k();
            }
            return this.k;
        }
    }

    public final boolean f() {
        return (!this.j || this.k || this.l) ? false : true;
    }

    public final boolean a(int i, ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        String str = "FileMuxer";
        if (this.l) {
            Log.e(str, "Cannot write data once released");
            return false;
        } else if (this.k) {
            Log.e(str, "Cannot write data once stopped");
            return false;
        } else if (this.j) {
            try {
                if (!this.e) {
                    this.a.writeSampleData(i, byteBuffer, bufferInfo);
                }
                this.f += (long) (bufferInfo.size - bufferInfo.offset);
                return true;
            } catch (Exception e) {
                Log.e(str, "Writing sample data failed", e);
                return false;
            }
        } else {
            Log.e(str, "Muxer not started");
            return false;
        }
    }

    public final void i() {
        k();
    }

    public final void a(Context context, acht acht) {
        amqw.a((Object) acht);
        String str = "video/mp4v-es";
        String str2 = "video/avc";
        MediaScannerConnection.scanFile(context, new String[]{this.b}, VERSION.SDK_INT >= 21 ? new String[]{str2, str} : new String[]{str2, str}, new achj(acht));
    }

    public final long j() {
        return this.f;
    }

    private final void k() {
        if (new File(this.b).delete()) {
            String valueOf = String.valueOf(this.b);
            String str = "Removed media file due to muxer failure: ";
            Log.e("FileMuxer", valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        }
    }
}
