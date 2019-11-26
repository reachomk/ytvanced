package defpackage;

import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Pair;

/* renamed from: okq */
public final class okq {
    public final String a;
    public final String b;
    public final CodecCapabilities c;
    public final boolean d;
    public final boolean e;
    private final boolean f;
    private final boolean g;

    public static okq a(String str, String str2, CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new okq(str, str2, codecCapabilities, false, z, z2);
    }

    public okq(String str, String str2, CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        this.a = (String) oxz.a((Object) str);
        this.b = str2;
        this.c = codecCapabilities;
        this.e = z;
        z = false;
        if (!z2 && codecCapabilities != null && ozp.a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f = z2;
        if (codecCapabilities != null && ozp.a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        if (z3 || (codecCapabilities != null && ozp.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback"))) {
            z = true;
        }
        this.d = z;
        this.g = oyu.b(str2);
    }

    public final String toString() {
        return this.a;
    }

    public final CodecProfileLevel[] a() {
        CodecCapabilities codecCapabilities = this.c;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new CodecProfileLevel[0] : this.c.profileLevels;
    }

    public final boolean a(nzw nzw) {
        String f;
        String str;
        String str2 = nzw.f;
        boolean z = false;
        if (!(str2 == null || this.b == null)) {
            f = oyu.f(str2);
            if (f != null) {
                str = ", ";
                StringBuilder stringBuilder;
                if (this.b.equals(f)) {
                    Pair b = okx.b(str2);
                    if (b != null) {
                        int intValue = ((Integer) b.first).intValue();
                        int intValue2 = ((Integer) b.second).intValue();
                        if (this.g || intValue == 42) {
                            CodecProfileLevel[] a = a();
                            int length = a.length;
                            int i = 0;
                            while (i < length) {
                                CodecProfileLevel codecProfileLevel = a[i];
                                if (codecProfileLevel.profile != intValue || codecProfileLevel.level < intValue2) {
                                    i++;
                                }
                            }
                            stringBuilder = new StringBuilder((str2.length() + 22) + f.length());
                            stringBuilder.append("codec.profileLevel, ");
                            stringBuilder.append(str2);
                            stringBuilder.append(str);
                            stringBuilder.append(f);
                            a(stringBuilder.toString());
                        }
                    }
                } else {
                    stringBuilder = new StringBuilder((str2.length() + 13) + f.length());
                    stringBuilder.append("codec.mime ");
                    stringBuilder.append(str2);
                    stringBuilder.append(str);
                    stringBuilder.append(f);
                    a(stringBuilder.toString());
                }
                return false;
            }
        }
        int i2;
        int i3;
        if (!this.g) {
            if (ozp.a >= 21) {
                i2 = nzw.w;
                if (i2 != -1) {
                    CodecCapabilities codecCapabilities = this.c;
                    if (codecCapabilities == null) {
                        a("sampleRate.caps");
                    } else {
                        AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities == null) {
                            a("sampleRate.aCaps");
                        } else if (!audioCapabilities.isSampleRateSupported(i2)) {
                            StringBuilder stringBuilder2 = new StringBuilder(31);
                            stringBuilder2.append("sampleRate.support, ");
                            stringBuilder2.append(i2);
                            a(stringBuilder2.toString());
                        }
                    }
                    return z;
                }
                i3 = nzw.v;
                if (i3 != -1) {
                    CodecCapabilities codecCapabilities2 = this.c;
                    if (codecCapabilities2 == null) {
                        a("channelCount.caps");
                    } else {
                        AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            a("channelCount.aCaps");
                        } else {
                            f = this.a;
                            str = this.b;
                            i2 = audioCapabilities2.getMaxInputChannelCount();
                            if (i2 <= 1 && !((ozp.a >= 26 && i2 > 0) || "audio/mpeg".equals(str) || "audio/3gpp".equals(str) || "audio/amr-wb".equals(str) || "audio/mp4a-latm".equals(str) || "audio/vorbis".equals(str) || "audio/opus".equals(str) || "audio/raw".equals(str) || "audio/flac".equals(str) || "audio/g711-alaw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/gsm".equals(str))) {
                                int i4 = !"audio/ac3".equals(str) ? "audio/eac3".equals(str) ? 16 : 30 : 6;
                                StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(f).length() + 59);
                                stringBuilder3.append("AssumedMaxChannelAdjustment: ");
                                stringBuilder3.append(f);
                                stringBuilder3.append(", [");
                                stringBuilder3.append(i2);
                                stringBuilder3.append(" to ");
                                stringBuilder3.append(i4);
                                stringBuilder3.append("]");
                                oyp.a("MediaCodecInfo", stringBuilder3.toString());
                                i2 = i4;
                            }
                            if (i2 < i3) {
                                StringBuilder stringBuilder4 = new StringBuilder(33);
                                stringBuilder4.append("channelCount.support, ");
                                stringBuilder4.append(i3);
                                a(stringBuilder4.toString());
                            }
                        }
                    }
                    return false;
                }
            }
            z = true;
            return z;
        } else if (nzw.n <= 0 || nzw.o <= 0) {
            return true;
        } else {
            if (ozp.a >= 21) {
                return a(nzw.n, nzw.o, (double) nzw.p);
            }
            if (nzw.n * nzw.o <= okx.a()) {
                z = true;
            }
            if (!z) {
                i2 = nzw.n;
                i3 = nzw.o;
                StringBuilder stringBuilder5 = new StringBuilder(40);
                stringBuilder5.append("legacyFrameSize, ");
                stringBuilder5.append(i2);
                stringBuilder5.append("x");
                stringBuilder5.append(i3);
                a(stringBuilder5.toString());
            }
            return z;
        }
    }

    public final boolean b(nzw nzw) {
        if (this.g) {
            return this.f;
        }
        Pair b = okx.b(nzw.f);
        return b != null && ((Integer) b.first).intValue() == 42;
    }

    public final boolean a(nzw nzw, nzw nzw2, boolean z) {
        boolean z2 = false;
        if (this.g) {
            if (nzw.i.equals(nzw2.i) && nzw.q == nzw2.q && (this.f || (nzw.n == nzw2.n && nzw.o == nzw2.o))) {
                if (!z && nzw2.u == null) {
                    z2 = true;
                } else if (ozp.a(nzw.u, nzw2.u)) {
                    return true;
                } else {
                    return z2;
                }
            }
            return z2;
        }
        if ("audio/mp4a-latm".equals(this.b) && nzw.i.equals(nzw2.i) && nzw.v == nzw2.v && nzw.w == nzw2.w) {
            Pair b = okx.b(nzw.f);
            Pair b2 = okx.b(nzw2.f);
            if (!(b == null || b2 == null)) {
                return ((Integer) b.first).intValue() == 42 && ((Integer) b2.first).intValue() == 42;
            }
        }
    }

    public final boolean a(int i, int i2, double d) {
        CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        if (!okq.a(videoCapabilities, i, i2, d)) {
            String str = "x";
            StringBuilder stringBuilder;
            if (i >= i2 || !okq.a(videoCapabilities, i2, i, d)) {
                stringBuilder = new StringBuilder(69);
                stringBuilder.append("sizeAndRate.support, ");
                stringBuilder.append(i);
                stringBuilder.append(str);
                stringBuilder.append(i2);
                stringBuilder.append(str);
                stringBuilder.append(d);
                a(stringBuilder.toString());
                return false;
            }
            stringBuilder = new StringBuilder(69);
            stringBuilder.append("sizeAndRate.rotated, ");
            stringBuilder.append(i);
            stringBuilder.append(str);
            stringBuilder.append(i2);
            stringBuilder.append(str);
            stringBuilder.append(d);
            String stringBuilder2 = stringBuilder.toString();
            String str2 = this.a;
            String str3 = this.b;
            String str4 = ozp.e;
            String.valueOf(stringBuilder2).length();
            String.valueOf(str2).length();
            String.valueOf(str3).length();
            String.valueOf(str4).length();
        }
        return true;
    }

    public final void a(String str) {
        String str2 = this.a;
        String str3 = this.b;
        String str4 = ozp.e;
        String.valueOf(str).length();
        String.valueOf(str2).length();
        String.valueOf(str3).length();
        String.valueOf(str4).length();
    }

    private static boolean a(VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }
}
