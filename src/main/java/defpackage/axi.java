package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: axi */
public final class axi implements awz {
    public final Object a = new Object();
    public axm b;
    public awy c;
    private final Context d;
    private final yg e;
    private Handler f;
    private HandlerThread g;
    private ContentObserver h;
    private Runnable i;

    axi(Context context, yg ygVar) {
        aad.a((Object) context, (Object) "Context cannot be null");
        aad.a((Object) ygVar, (Object) "FontRequest cannot be null");
        this.d = context.getApplicationContext();
        this.e = ygVar;
    }

    public final void a(awy awy) {
        aad.a((Object) awy, (Object) "LoaderCallback cannot be null");
        synchronized (this.a) {
            if (this.f == null) {
                this.g = new HandlerThread("emojiCompat", 10);
                this.g.start();
                this.f = new Handler(this.g.getLooper());
            }
            this.f.post(new axl(this, awy));
        }
    }

    private final void b() {
        this.c = null;
        ContentObserver contentObserver = this.h;
        if (contentObserver != null) {
            this.d.getContentResolver().unregisterContentObserver(contentObserver);
            this.h = null;
        }
        synchronized (this.a) {
            this.f.removeCallbacks(this.i);
            HandlerThread handlerThread = this.g;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.f = null;
            this.g = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (this.c != null) {
            try {
                ym a = yj.a(this.d, null, this.e);
                if (a.a == 0) {
                    yp[] ypVarArr = a.b;
                    if (ypVarArr == null || ypVarArr.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    int i = 0;
                    yp ypVar = ypVarArr[0];
                    int i2 = ypVar.e;
                    if (i2 == 2) {
                        synchronized (this.a) {
                            axm axm = this.b;
                            if (axm != null) {
                                long a2 = axm.a();
                                if (a2 >= 0) {
                                    Uri uri = ypVar.a;
                                    synchronized (this.a) {
                                        if (this.h == null) {
                                            this.h = new axk(this, this.f);
                                            Context context = this.d;
                                            context.getContentResolver().registerContentObserver(uri, false, this.h);
                                        }
                                        if (this.i == null) {
                                            this.i = new axn(this);
                                        }
                                        this.f.postDelayed(this.i, a2);
                                    }
                                    return;
                                }
                            }
                        }
                    }
                    if (i2 == 0) {
                        Typeface a3 = yj.a(this.d, null, new yp[]{ypVar});
                        ByteBuffer a4 = sq.a(this.d, null, ypVar.a);
                        if (a4 != null) {
                            awy awy = this.c;
                            a4 = a4.duplicate();
                            axp axp = new axp(a4);
                            axp.a(4);
                            char c = (char) axp.a.getShort();
                            if (c <= 'd') {
                                long a5;
                                axp.a(6);
                                for (char c2 = 0; c2 < c; c2++) {
                                    int b = axp.b();
                                    axp.a(4);
                                    a5 = axp.a();
                                    axp.a(4);
                                    if (b == 1835365473) {
                                        break;
                                    }
                                }
                                a5 = -1;
                                if (a5 != -1) {
                                    axp.a((int) (a5 - ((long) axp.a.position())));
                                    axp.a(12);
                                    long a6 = axp.a();
                                    while (((long) i) < a6) {
                                        int b2 = axp.b();
                                        long a7 = axp.a();
                                        axp.a();
                                        if (b2 != 1164798569) {
                                            if (b2 != 1701669481) {
                                                i++;
                                            }
                                        }
                                        a4.position((int) new axo(a7 + a5).a);
                                        bff bff = new bff();
                                        a4.order(ByteOrder.LITTLE_ENDIAN);
                                        bff.a = a4.getInt(a4.position()) + a4.position();
                                        bff.b = a4;
                                        awy.a(new axq(a3, bff));
                                        b();
                                        return;
                                    }
                                }
                                throw new IOException("Cannot read metadata.");
                            }
                            throw new IOException("Cannot read metadata.");
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("fetchFonts result is not OK. (");
                    stringBuilder.append(i2);
                    stringBuilder.append(")");
                    throw new RuntimeException(stringBuilder.toString());
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("fetchFonts failed (");
                stringBuilder2.append(a.a);
                stringBuilder2.append(")");
                throw new RuntimeException(stringBuilder2.toString());
            } catch (NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            } catch (Throwable th) {
                this.c.a(th);
                b();
            }
        }
    }
}
