package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: afdk */
final class afdk extends HandlerThread implements Callback {
    public Handler a;
    private afdj b;

    afdk(afdj afdj) {
        super("YouTubePlayer.MediaPlayerThread");
        this.b = afdj;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        this.a.removeMessages(1);
        this.a.sendEmptyMessage(!z ? 8 : 5);
    }

    public final synchronized void start() {
        super.start();
        this.a = new Handler(getLooper(), this);
    }

    public final boolean quit() {
        if (getLooper() == null) {
            return false;
        }
        this.a.sendEmptyMessage(6);
        return true;
    }

    public final boolean handleMessage(Message message) {
        String str = "Media Player error preparing video";
        String str2 = "Error calling mediaPlayer";
        afdj afdj;
        aeps aeps;
        switch (message.what) {
            case 1:
                Object[] objArr = (Object[]) message.obj;
                afdj afdj2 = this.b;
                aeps aeps2 = (aeps) objArr[0];
                Uri uri = (Uri) objArr[1];
                afdj2.e.set(aeps2);
                if (aeps2 == null || uri == null) {
                    str = String.valueOf(aeps2);
                    String valueOf = String.valueOf(uri);
                    StringBuilder stringBuilder = new StringBuilder((str.length() + 43) + valueOf.length());
                    stringBuilder.append("Media Player null pointer preparing video ");
                    stringBuilder.append(str);
                    stringBuilder.append(" ");
                    stringBuilder.append(valueOf);
                    xtl.d(stringBuilder.toString());
                    afdj2.h.a(new afif("android.fw.npe", 0, new NullPointerException()));
                } else {
                    try {
                        if (!(afdj2.n || afdj2.o)) {
                            afdj2.h.a();
                        }
                        afdj2.a(aeps2, afdj2.u);
                        Context context = afdj2.a;
                        HashMap hashMap = new HashMap();
                        hashMap.put("x-disconnect-at-highwatermark", "1");
                        hashMap.put("User-Agent", afdj2.c);
                        aeps2.a(context, uri, hashMap);
                        aeps2.b();
                        afdj2.h.b(aeps2.f());
                        afdj2.c(true);
                    } catch (IOException e) {
                        xtl.b(str, (Throwable) e);
                        afdj2.h.a(new afif("android.fw.prepare", 0, e));
                    } catch (IllegalArgumentException e2) {
                        xtl.b(str, (Throwable) e2);
                        afdj2.h.a(new afif("android.fw.ise", 0, e2));
                    } catch (IllegalStateException e3) {
                        xtl.b(str2, e3);
                    }
                }
                return true;
            case 2:
                afdj = this.b;
                afdj.q = true;
                aeps = (aeps) afdj.e.get();
                if (aeps != null) {
                    try {
                        afkh afkh;
                        if (afdj.j) {
                            if (!afdj.l && afdj.k) {
                                aeps.c();
                                afkh = afdj.u;
                                if (afkh != null) {
                                    afkh.c(500);
                                }
                                afdj.l = true;
                            }
                            if (!afdj.o && afdj.k && afdj.i) {
                                afdj.h.c();
                            }
                        } else if (afdj.h()) {
                            aeps.c();
                            afkh = afdj.u;
                            if (afkh != null) {
                                afkh.c(500);
                            }
                            afdj.l = true;
                            if (!afdj.o) {
                                afdj.h.c();
                            }
                        }
                        afdj.o = false;
                    } catch (IllegalStateException e32) {
                        xtl.b(str2, e32);
                    }
                }
                return true;
            case 3:
                afdj = this.b;
                afdj.g.d();
                aeps = (aeps) afdj.e.get();
                if (aeps != null && afdj.h()) {
                    try {
                        aeps.d();
                        afdj.l = false;
                        afdj.q = false;
                        afdj.h.d();
                        afdj.c(false);
                    } catch (IllegalStateException e322) {
                        xtl.b(str2, e322);
                    }
                } else if (afdj.q) {
                    afdj.q = false;
                    afdj.h.d();
                }
                return true;
            case 4:
                afdj afdj3 = this.b;
                long longValue = ((Long) message.obj).longValue();
                aeps aeps3 = (aeps) afdj3.e.get();
                if (afdj3.q) {
                    afdj3.h.a(longValue);
                } else {
                    afdj3.h.b(longValue);
                }
                if (aeps3 == null || !afdj3.h()) {
                    afdj3.a(afdj3.t, longValue);
                } else {
                    try {
                        aeps3.a(longValue);
                        if (!afdj3.l && afdj3.q) {
                            afdj3.m();
                        }
                    } catch (IllegalStateException e3222) {
                        xtl.b(str2, e3222);
                    }
                }
                return true;
            case 5:
                this.b.b(true);
                return true;
            case 6:
                this.b.b(true);
                getLooper().quit();
                this.a.removeCallbacksAndMessages(null);
                this.b = null;
                return true;
            case 7:
                this.b.q = true;
                return true;
            case 8:
                this.b.b(false);
                return true;
            default:
                return false;
        }
    }
}
