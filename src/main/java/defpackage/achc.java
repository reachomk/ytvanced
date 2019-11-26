package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: achc */
public abstract class achc extends Callback implements achm {
    public final String a;
    public final MediaCodec b;
    public int c;
    public acho d;
    public int e = 1;
    private final achr f;
    private final MediaFormat g;
    private long h = -1;
    private int i = -1;
    private long j;
    private long k = -1;
    private boolean l;
    private boolean m;
    private achp n;

    achc(MediaFormat mediaFormat, achr achr) {
        String name;
        this.g = (MediaFormat) amqw.a((Object) mediaFormat);
        this.b = MediaCodec.createEncoderByType(mediaFormat.getString("mime"));
        this.b.setCallback(this);
        this.b.configure(mediaFormat, null, null, 1);
        try {
            name = this.b.getName();
        } catch (IllegalStateException e) {
            Log.e("ScreencastBaseEncoder", "Error obtaining codec name", e);
            name = "";
        }
        this.a = name;
        this.f = (achr) amqw.a((Object) achr);
    }

    public abstract void a();

    public final String e() {
        return this.a;
    }

    public final boolean f() {
        int i = this.e;
        return i == 2 || i == 3 || i == 4;
    }

    public boolean b() {
        if (f()) {
            return true;
        }
        if (this.e != 1) {
            String valueOf = String.valueOf(this.a);
            String str = "Cannot start once stopped or released: ";
            Log.e("ScreencastBaseEncoder", valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            return false;
        }
        String str2;
        String valueOf2;
        try {
            str2 = "Start encoder ";
            valueOf2 = String.valueOf(this.a);
            if (valueOf2.length() == 0) {
                valueOf2 = new String(str2);
            } else {
                str2.concat(valueOf2);
            }
            this.b.start();
            this.e = 2;
        } catch (Exception unused) {
            str2 = String.valueOf(this.a);
            valueOf2 = "Starting encoder failed: ";
            if (str2.length() == 0) {
                str2 = new String(valueOf2);
            } else {
                valueOf2.concat(str2);
            }
        }
        if (this.e == 2) {
            return true;
        }
        return false;
    }

    public final void a(acho acho) {
        this.d = acho;
    }

    public final boolean a(boolean z) {
        String str = "ScreencastBaseEncoder";
        String valueOf;
        String str2;
        if (f()) {
            int i = this.e;
            int i2 = 4;
            if (i != 2) {
                if (!z) {
                    i2 = 3;
                }
                if (i == i2) {
                    return true;
                }
                valueOf = String.valueOf(this.a);
                str2 = "Cannot switch between pause/still frame for encoder: ";
                Log.e(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                return false;
            }
            if (z) {
                this.e = 4;
            } else {
                this.e = 3;
                this.k = System.nanoTime();
            }
            return true;
        }
        valueOf = String.valueOf(this.a);
        str2 = "Cannot pause inactive encoder: ";
        Log.e(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
        return false;
    }

    public final boolean g() {
        int i = this.e;
        if (i != 2) {
            if (i == 3 || i == 4) {
                if (i == 3 && this.k >= 0) {
                    this.j += ((System.nanoTime() - this.k) / 1000) - 100;
                    this.k = -1;
                }
                this.e = 2;
            } else {
                String valueOf = String.valueOf(this.a);
                String str = "Cannot resume non paused encoder: ";
                Log.e("ScreencastBaseEncoder", valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                return false;
            }
        }
        return true;
    }

    public boolean c() {
        if (this.e == 5) {
            return true;
        }
        String str;
        if (f()) {
            String valueOf;
            try {
                str = "Stop encoder ";
                valueOf = String.valueOf(this.a);
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    str.concat(valueOf);
                }
                this.b.stop();
                this.e = 5;
            } catch (Exception unused) {
                str = String.valueOf(this.a);
                valueOf = "Stopping encoder failed: ";
                if (str.length() == 0) {
                    str = new String(valueOf);
                } else {
                    valueOf.concat(str);
                }
            }
            if (this.e == 5) {
                return true;
            }
            return false;
        }
        str = String.valueOf(this.a);
        String str2 = "Encoder not active: ";
        Log.e("ScreencastBaseEncoder", str.length() == 0 ? new String(str2) : str2.concat(str));
        return false;
    }

    public final boolean a(achp achp) {
        String valueOf;
        if (f()) {
            if (!this.m) {
                valueOf = String.valueOf(this.a);
                String str = "Signal EOS for encoder ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    str.concat(valueOf);
                }
                this.m = true;
                this.n = achp;
                a();
            }
            return true;
        }
        String valueOf2 = String.valueOf(this.a);
        valueOf = "Cannot signal EOS unless active: ";
        Log.e("ScreencastBaseEncoder", valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
        return false;
    }

    public boolean d() {
        if (this.e == 6) {
            return true;
        }
        String str;
        String valueOf;
        try {
            str = "Release encoder ";
            valueOf = String.valueOf(this.a);
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            this.b.release();
            this.e = 6;
        } catch (Exception unused) {
            str = String.valueOf(this.a);
            valueOf = "Releasing encoder failed: ";
            if (str.length() == 0) {
                str = new String(valueOf);
            } else {
                valueOf.concat(str);
            }
        }
        if (this.e == 6) {
            return true;
        }
        return false;
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, BufferInfo bufferInfo) {
        MediaCodec mediaCodec2 = mediaCodec;
        int i2 = i;
        BufferInfo bufferInfo2 = bufferInfo;
        String str = "ScreencastBaseEncoder";
        String valueOf;
        if (mediaCodec2 != this.b || this.i < 0) {
            valueOf = String.valueOf(this.a);
            String str2 = "Skipping request to process buffer on missing codec: ";
            Log.e(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
            return;
        }
        String str3 = "Unexpected buffer index (";
        StringBuilder stringBuilder;
        if (i2 < 0) {
            valueOf = this.a;
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 49);
            stringBuilder.append(str3);
            stringBuilder.append(i2);
            stringBuilder.append(") for codec: ");
            stringBuilder.append(valueOf);
            Log.e(str, stringBuilder.toString());
        } else if (this.l) {
            valueOf = this.a;
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 59);
            stringBuilder.append(str3);
            stringBuilder.append(i2);
            stringBuilder.append(")  after EOS on codec: ");
            stringBuilder.append(valueOf);
            Log.e(str, stringBuilder.toString());
        } else {
            String valueOf2;
            try {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
                if (outputBuffer == null) {
                    valueOf = "Codec produced no output data in its buffer: ";
                    valueOf2 = String.valueOf(this.a);
                    if (valueOf2.length() == 0) {
                        valueOf2 = new String(valueOf);
                    } else {
                        valueOf2 = valueOf.concat(valueOf2);
                    }
                    Log.e(str, valueOf2);
                    c(7);
                    return;
                }
                int i3 = bufferInfo2.flags;
                if ((i3 & 2) != 0) {
                    bufferInfo2.size = 0;
                }
                if (bufferInfo2.size != 0) {
                    if (this.j > 0) {
                        bufferInfo2.presentationTimeUs -= this.j;
                    }
                    if (bufferInfo2.presentationTimeUs > 0) {
                        if (this.h > 0) {
                            long j = bufferInfo2.presentationTimeUs;
                            long j2 = this.h;
                            if (j < j2 + 100) {
                                String str4 = this.a;
                                j = bufferInfo2.presentationTimeUs;
                                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str4).length() + 103);
                                stringBuilder2.append("Timewarp for ");
                                stringBuilder2.append(str4);
                                stringBuilder2.append(". Last frame at ");
                                stringBuilder2.append(j2);
                                stringBuilder2.append(" is too close to current frame at ");
                                stringBuilder2.append(j);
                                Log.e(str, stringBuilder2.toString());
                                bufferInfo2.presentationTimeUs = this.h + 100;
                            }
                        }
                        this.h = bufferInfo2.presentationTimeUs;
                        achr achr = this.f;
                        if (achr != null && achr.f()) {
                            outputBuffer.position(bufferInfo2.offset);
                            outputBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                            if (!this.f.a(this.i, outputBuffer, bufferInfo2)) {
                                c(19);
                            }
                        }
                    }
                }
                mediaCodec2.releaseOutputBuffer(i2, false);
                if ((i3 & 4) != 0) {
                    if (this.l) {
                        valueOf = "End of stream already reached for codec: ";
                        valueOf2 = String.valueOf(this.a);
                        Log.w(str, valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
                    } else if (this.m) {
                        valueOf = "End of stream reached for codec: ";
                        valueOf2 = String.valueOf(this.a);
                        if (valueOf2.length() == 0) {
                            valueOf2 = new String(valueOf);
                        } else {
                            valueOf.concat(valueOf2);
                        }
                        i();
                    } else {
                        valueOf = "Reached end of stream unexpectedly for codec: ";
                        valueOf2 = String.valueOf(this.a);
                        if (valueOf2.length() == 0) {
                            valueOf2 = new String(valueOf);
                        } else {
                            valueOf2 = valueOf.concat(valueOf2);
                        }
                        Log.w(str, valueOf2);
                        c(7);
                    }
                }
            } catch (Exception e) {
                valueOf2 = this.a;
                stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 51);
                stringBuilder.append("Codec experienced an error for buffer ");
                stringBuilder.append(i2);
                stringBuilder.append(": ");
                stringBuilder.append(valueOf2);
                Log.e(str, stringBuilder.toString(), e);
                if (this.m) {
                    i();
                } else {
                    c(7);
                }
            }
        }
    }

    public final int h() {
        return this.c;
    }

    private final void i() {
        this.l = true;
        achp achp = this.n;
        if (achp != null) {
            achp.a(this);
        }
    }

    public final void onError(MediaCodec mediaCodec, CodecException codecException) {
        String valueOf = String.valueOf(this.a);
        String str = "Encoder encountered error: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        Log.e("ScreencastBaseEncoder", valueOf, codecException);
        c(7);
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        String str = "bitrate";
        achc.a(mediaFormat, this.g, str);
        achc.a(mediaFormat, this.g, "sample-rate");
        achc.a(mediaFormat, this.g, "frame-rate");
        this.c = mediaFormat.getInteger(str);
        int a = this.f.a(mediaFormat);
        String str2 = "ScreencastBaseEncoder";
        String valueOf;
        if (a < 0) {
            valueOf = String.valueOf(this.a);
            str = "Encoder could not add track to muxer: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            Log.e(str2, valueOf);
            c(7);
            return;
        }
        this.i = a;
        if (this.f.a() && !this.f.d()) {
            valueOf = String.valueOf(this.a);
            str = "Encoder could not start muxer: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            Log.e(str2, valueOf);
            c(19);
        }
    }

    private static void a(MediaFormat mediaFormat, MediaFormat mediaFormat2, String str) {
        if (!mediaFormat.containsKey(str) && mediaFormat2.containsKey(str)) {
            mediaFormat.setInteger(str, mediaFormat2.getInteger(str));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(int i) {
        acho acho = this.d;
        if (acho != null) {
            acho.a(this, i);
        }
    }
}
