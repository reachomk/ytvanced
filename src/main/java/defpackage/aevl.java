package defpackage;

import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaDrm.MediaDrmStateException;
import android.media.ResourceBusyException;
import android.os.Build.VERSION;
import android.view.Surface;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper.DrmProvisionException;
import java.io.IOException;

/* renamed from: aevl */
public final class aevl {
    public static afif a(IllegalStateException illegalStateException, long j, Surface surface) {
        String str = "fmt.decode";
        String str2 = ";sur.";
        String str3 = "src.decfail;info.";
        String diagnosticInfo;
        String a;
        StringBuilder stringBuilder;
        if (VERSION.SDK_INT >= 21 && (illegalStateException instanceof CodecException)) {
            diagnosticInfo = ((CodecException) illegalStateException).getDiagnosticInfo();
            a = aevl.a(surface);
            stringBuilder = new StringBuilder((String.valueOf(diagnosticInfo).length() + 22) + String.valueOf(a).length());
            stringBuilder.append(str3);
            stringBuilder.append(diagnosticInfo);
            stringBuilder.append(str2);
            stringBuilder.append(a);
            return new afif(str, j, stringBuilder.toString());
        }
        diagnosticInfo = afht.a((Object) illegalStateException);
        a = aevl.a(surface);
        stringBuilder = new StringBuilder((String.valueOf(diagnosticInfo).length() + 22) + String.valueOf(a).length());
        stringBuilder.append(str3);
        stringBuilder.append(diagnosticInfo);
        stringBuilder.append(str2);
        stringBuilder.append(a);
        return new afif(str, j, stringBuilder.toString());
    }

    private static String a(Surface surface) {
        if (surface == null) {
            return "null";
        }
        return !surface.isValid() ? "invalid" : "valid";
    }

    public static boolean a(Throwable th) {
        if (!(th instanceof IllegalStateException)) {
            return false;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = true;
        if (VERSION.SDK_INT < 21 || !(th instanceof CodecException)) {
            if (stackTrace.length <= 0) {
                z = false;
            } else if (stackTrace[0].getClassName().contains("MediaCodec")) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    public static afif a(int i, Throwable th, long j, long j2) {
        StringBuilder stringBuilder = new StringBuilder(52);
        stringBuilder.append("widevine;exo.");
        stringBuilder.append(j2);
        stringBuilder.append(";reason.");
        stringBuilder.append(i);
        String stringBuilder2 = stringBuilder.toString();
        String str = "unimplemented";
        if (th instanceof Exception) {
            return aevl.a((Exception) th, j, str, (Object) stringBuilder2, true);
        }
        return new afif(4, str, j, stringBuilder2);
    }

    public static afif a(Exception exception, long j, Surface surface, xhv xhv, int i) {
        long j2 = j;
        Object cause = exception.getCause();
        String str = "fmt.unparseable";
        if (cause instanceof owe) {
            return new afif(str, j, ((owe) cause).a);
        }
        if ((cause instanceof nnc) || (cause instanceof oae)) {
            return new afif(str, j, cause);
        }
        int errorCode;
        StringBuilder stringBuilder;
        if (cause instanceof nws) {
            return new afif(5, "net.retryexhausted", j, cause.getCause());
        } else if (cause instanceof IOException) {
            xhv xhv2 = xhv;
            return aevl.a((IOException) cause, j, xhv, 8);
        } else if (cause instanceof CryptoException) {
            CryptoException cryptoException = (CryptoException) cause;
            errorCode = cryptoException.getErrorCode();
            str = afht.a(cryptoException, true, 2, 160);
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
            stringBuilder.append(errorCode);
            stringBuilder.append("-");
            stringBuilder.append(str);
            return new afif(4, "keyerror", j, stringBuilder.toString());
        } else {
            boolean z = cause instanceof nmm;
            str = "fmt.decode";
            Surface surface2;
            if (z || (cause instanceof oks)) {
                surface2 = surface;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("src.decinit");
                String str2 = ";mime.";
                String str3 = ";info.";
                String str4 = ";name.";
                if (cause instanceof oks) {
                    oks oks = (oks) cause;
                    stringBuilder2.append(str4);
                    stringBuilder2.append(oks.c);
                    stringBuilder2.append(str3);
                    stringBuilder2.append(oks.d);
                    stringBuilder2.append(str2);
                    stringBuilder2.append(oks.a);
                } else if (z) {
                    nmm nmm = (nmm) cause;
                    stringBuilder2.append(str4);
                    stringBuilder2.append(nmm.b);
                    stringBuilder2.append(str3);
                    stringBuilder2.append(nmm.c);
                    stringBuilder2.append(str2);
                    stringBuilder2.append(nmm.a);
                }
                stringBuilder2.append(";sur.");
                stringBuilder2.append(aevl.a(surface));
                return new afif(str, j, stringBuilder2.toString());
            }
            Object str5;
            if (cause instanceof nnu) {
                errorCode = ((nnu) cause).a;
            } else if (cause instanceof occ) {
                errorCode = ((occ) cause).a;
            } else {
                if (cause instanceof nnt) {
                    errorCode = ((nnt) cause).a;
                } else if (cause instanceof oce) {
                    errorCode = ((oce) cause).a;
                } else if (cause instanceof afgr) {
                    return new afif("fmt.noneavailable", j, cause.getMessage());
                } else if ((cause instanceof aewy) || (cause instanceof oez)) {
                    return new afjl(str, j, cause.getMessage());
                } else {
                    if (cause instanceof OutOfMemoryError) {
                        if (i != 3) {
                            return new afif(8, "player.outofmemory", j, cause);
                        }
                        return new afjl("player.outofmemory", j, cause);
                    } else if (aevl.a((Throwable) cause)) {
                        surface2 = surface;
                        return aevl.a((IllegalStateException) cause, j, surface);
                    } else if (cause instanceof RuntimeException) {
                        return new afif("player.fatalexception", j, cause);
                    } else {
                        if (cause == null) {
                            cause = exception.getMessage();
                        }
                        return new afif("player.exception", j, cause);
                    }
                }
                stringBuilder = new StringBuilder(32);
                stringBuilder.append("src.audwrite;errcode.");
                stringBuilder.append(errorCode);
                return new afif(str, j, stringBuilder.toString());
            }
            String str6 = "src.audinit;info.";
            String valueOf = String.valueOf(afht.a(Integer.valueOf(errorCode)));
            if (valueOf.length() == 0) {
                str5 = new String(str6);
            } else {
                str5 = str6.concat(valueOf);
            }
            return new afif(str, j, str5);
        }
    }

    public static afif a(Exception exception, long j, String str, Object obj, boolean z) {
        Exception exception2 = exception;
        Object obj2 = "";
        Throwable cause;
        String str2;
        if (exception2 instanceof aeti) {
            afif f;
            aeti aeti = (aeti) exception2;
            aetl aetl = aeti.a;
            cause = aeti.getCause();
            boolean z2 = aeti.c;
            if (aetl != null) {
                afif afif = new afif(4, "auth", j, aetl);
            } else {
                if (cause instanceof bqn) {
                    bqd bqd = ((bqn) cause).b;
                    if (bqd == null) {
                        String str3 = "provisioning";
                        if (cause instanceof bqo) {
                            f = new afif(4, "net.timeout", j, z2 ? str3 : null).f();
                        } else if (cause instanceof bqg) {
                            f = new afif(4, "net.connect", j, z2 ? str3 : null).f();
                        }
                    } else {
                        if (z2) {
                            str2 = "provisioning.";
                        }
                        int i = bqd.a;
                        StringBuilder stringBuilder = new StringBuilder(str2.length() + 11);
                        stringBuilder.append(str2);
                        stringBuilder.append(i);
                        f = new afif(4, "net.badstatus", j, stringBuilder.toString()).f();
                    }
                }
                afif afif2 = new afif(4, "", j, aeti);
            }
            return f;
        } else if (exception2 instanceof DrmProvisionException) {
            cause = exception.getCause();
            if (VERSION.SDK_INT >= 21 && (cause instanceof MediaDrmStateException)) {
                cause = ((MediaDrmStateException) cause).getDiagnosticInfo();
            }
            return new afif(4, "provision", j, cause);
        } else {
            String str4 = "info.";
            String str5 = "init.info.";
            String diagnosticInfo;
            if (VERSION.SDK_INT >= 21 && (exception2 instanceof MediaDrmStateException)) {
                diagnosticInfo = ((MediaDrmStateException) exception2).getDiagnosticInfo();
                if (z) {
                    str4 = str5;
                }
                diagnosticInfo = String.valueOf(diagnosticInfo);
                return new afif(4, "unavailable", j, diagnosticInfo.length() == 0 ? new String(str4) : str4.concat(diagnosticInfo));
            } else if (exception2 instanceof ResourceBusyException) {
                if (z) {
                    str4 = str5;
                }
                diagnosticInfo = String.valueOf(exception.getMessage());
                return new afif(4, "unavailable", j, diagnosticInfo.length() == 0 ? new String(str4) : str4.concat(diagnosticInfo));
            } else {
                if (!str.equals("unimplemented")) {
                    Object obj3 = obj;
                } else if (obj instanceof String) {
                    if (exception.getCause() != null) {
                        diagnosticInfo = String.valueOf(afht.a(exception.getCause()));
                        str2 = ";exception.";
                        if (diagnosticInfo.length() == 0) {
                            obj2 = new String(str2);
                        } else {
                            obj2 = str2.concat(diagnosticInfo);
                        }
                    }
                    String valueOf = String.valueOf(obj);
                    StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + String.valueOf(obj2).length());
                    stringBuilder2.append(valueOf);
                    stringBuilder2.append(obj2);
                    return new afif(4, "unimplemented", j, stringBuilder2.toString());
                }
                return new afif(4, str, j, obj);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014b  */
    public static defpackage.afif a(java.io.IOException r11, long r12, defpackage.xhv r14, int r15) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r11.getCause();
        r2 = r11 instanceof defpackage.owb;
        r3 = "net.connect";
        r4 = ";";
        if (r2 != 0) goto L_0x003b;
    L_0x0011:
        r5 = r11 instanceof defpackage.nvw;
        if (r5 != 0) goto L_0x003b;
    L_0x0015:
        r14 = r11 instanceof defpackage.nws;
        if (r14 == 0) goto L_0x001e;
    L_0x0019:
        r15 = 5;
        r7 = r3;
        r6 = 5;
        goto L_0x00a3;
    L_0x001e:
        r14 = r11 instanceof defpackage.nli;
        if (r14 == 0) goto L_0x0023;
    L_0x0022:
        goto L_0x0038;
    L_0x0023:
        r14 = r11 instanceof defpackage.onr;
        if (r14 != 0) goto L_0x0038;
    L_0x0027:
        r14 = r11 instanceof defpackage.afig;
        if (r14 == 0) goto L_0x002e;
    L_0x002b:
        r3 = "offline.fmt.noneavailable";
        goto L_0x0052;
    L_0x002e:
        r14 = r11 instanceof defpackage.afhk;
        if (r14 != 0) goto L_0x0035;
    L_0x0032:
        r3 = "player.exception";
        goto L_0x0052;
    L_0x0035:
        r3 = "policy.app";
        goto L_0x0052;
    L_0x0038:
        r3 = "qoe.livewindow";
        goto L_0x0052;
    L_0x003b:
        if (r14 != 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0047;
    L_0x003e:
        r14 = r14.c();
        if (r14 != 0) goto L_0x0047;
    L_0x0044:
        r3 = "net.unavailable";
        goto L_0x0052;
    L_0x0047:
        r14 = r11 instanceof defpackage.oen;
        if (r14 == 0) goto L_0x0055;
    L_0x004b:
        r14 = "type.loadtimeout;";
        r0.append(r14);
        r3 = "net.timeout";
    L_0x0052:
        r6 = r15;
        r7 = r3;
        goto L_0x00a3;
    L_0x0055:
        r14 = r11 instanceof defpackage.owd;
        if (r14 == 0) goto L_0x0074;
    L_0x0059:
        r14 = r11;
        r14 = (defpackage.owd) r14;
        r14 = r14.a;
        r3 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r14 == r3) goto L_0x0070;
    L_0x0062:
        r3 = "rc.";
        r0.append(r3);
        r0.append(r14);
        r0.append(r4);
        r14 = "net.badstatus";
        goto L_0x0072;
    L_0x0070:
        r14 = "staleconfig";
    L_0x0072:
        r3 = r14;
        goto L_0x0052;
    L_0x0074:
        if (r2 == 0) goto L_0x007c;
    L_0x0076:
        r14 = r11;
        r14 = (defpackage.owb) r14;
        r14 = r14.b;
        goto L_0x0081;
    L_0x007c:
        r14 = r11;
        r14 = (defpackage.nvw) r14;
        r14 = r14.a;
    L_0x0081:
        r5 = 1;
        if (r14 == r5) goto L_0x0094;
    L_0x0084:
        r3 = 2;
        if (r14 == r3) goto L_0x008a;
    L_0x0087:
        r14 = "net.closed";
        goto L_0x0072;
    L_0x008a:
        r14 = r1 instanceof java.net.SocketTimeoutException;
        if (r14 != 0) goto L_0x0091;
    L_0x008e:
        r14 = "net.read";
        goto L_0x0072;
    L_0x0091:
        r14 = "net.read.timeout";
        goto L_0x0072;
    L_0x0094:
        r14 = r1 instanceof java.net.UnknownHostException;
        if (r14 == 0) goto L_0x009b;
    L_0x0098:
        r14 = "net.dns";
        goto L_0x0072;
    L_0x009b:
        r14 = r1 instanceof java.net.SocketTimeoutException;
        if (r14 != 0) goto L_0x00a0;
    L_0x009f:
        goto L_0x0052;
    L_0x00a0:
        r14 = "net.connect.timeout";
        goto L_0x0072;
    L_0x00a3:
        r14 = "e.";
        r0.append(r14);
        r14 = defpackage.afht.a(r11);
        r0.append(r14);
        r0.append(r4);
        if (r1 == 0) goto L_0x00ff;
    L_0x00b4:
        r14 = r1 instanceof defpackage.bckg;
        if (r14 == 0) goto L_0x00f0;
    L_0x00b8:
        r14 = r1;
        r14 = (defpackage.bckg) r14;
        r15 = new java.lang.StringBuilder;
        r15.<init>();
        r3 = "cronet:nerrcode.";
        r15.append(r3);
        r3 = r14.a();
        r15.append(r3);
        r3 = ".cerrcode.";
        r15.append(r3);
        r3 = r14.b();
        r15.append(r3);
        r3 = r14 instanceof defpackage.bckn;
        if (r3 == 0) goto L_0x00ea;
    L_0x00dc:
        r3 = ".qerrcode.";
        r15.append(r3);
        r14 = (defpackage.bckn) r14;
        r14 = r14.d();
        r15.append(r14);
    L_0x00ea:
        r0.append(r15);
        r0.append(r4);
    L_0x00f0:
        r14 = "ncause.";
        r0.append(r14);
        r14 = defpackage.afht.a(r1);
        r0.append(r14);
        r0.append(r4);
    L_0x00ff:
        if (r2 == 0) goto L_0x0145;
    L_0x0101:
        r14 = r11;
        r14 = (defpackage.owb) r14;
        r14 = r14.c;
        if (r14 == 0) goto L_0x0130;
    L_0x0108:
        r15 = r14.a;
        if (r15 == 0) goto L_0x0130;
    L_0x010c:
        r1 = "rn";
        r15 = r15.getQueryParameter(r1);
        if (r15 == 0) goto L_0x011f;
    L_0x0114:
        r1 = "rn.";
        r0.append(r1);
        r0.append(r15);
        r0.append(r4);
    L_0x011f:
        r15 = "shost.";
        r0.append(r15);
        r14 = r14.a;
        r14 = r14.getHost();
        r0.append(r14);
        r0.append(r4);
    L_0x0130:
        r14 = r11 instanceof defpackage.oeu;
        if (r14 == 0) goto L_0x0145;
    L_0x0134:
        r11 = (defpackage.oeu) r11;
        r11 = r11.a;
        if (r11 == 0) goto L_0x0145;
    L_0x013a:
        r14 = "cnconstat.";
        r0.append(r14);
        r0.append(r11);
        r0.append(r4);
    L_0x0145:
        r11 = r0.length();
        if (r11 <= 0) goto L_0x0150;
    L_0x014b:
        r11 = r11 + -1;
        r0.deleteCharAt(r11);
    L_0x0150:
        r11 = new afif;
        r10 = r0.toString();
        r5 = r11;
        r8 = r12;
        r5.<init>(r6, r7, r8, r10);
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aevl.a(java.io.IOException, long, xhv, int):afif");
    }
}
