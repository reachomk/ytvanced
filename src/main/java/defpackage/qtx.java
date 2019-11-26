package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import android.os.Build.VERSION;
import android.util.Log;

/* renamed from: qtx */
public abstract class qtx {
    public static Context a = null;
    private static final Object d = new Object();
    private static volatile Boolean e = null;
    public final String b;
    public final String c;
    private final quk f;
    private final Object g;
    private volatile qtw h = null;
    private volatile SharedPreferences i = null;

    public static void a(Context context) {
        synchronized (d) {
            if (VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
            }
            if (a != context) {
                e = null;
            }
            a = context;
        }
    }

    public abstract Object a(SharedPreferences sharedPreferences);

    public abstract Object a(String str);

    /* JADX WARNING: Missing block: B:7:0x0014, code skipped:
            if (r0 == null) goto L_0x0025;
     */
    public final java.lang.Object a() {
        /*
        r2 = this;
        r0 = a;
        if (r0 == 0) goto L_0x0028;
    L_0x0004:
        r0 = r2.f;
        r0 = r0.f;
        if (r0 == 0) goto L_0x0018;
    L_0x000a:
        r0 = r2.c();
        if (r0 != 0) goto L_0x0017;
    L_0x0010:
        r0 = r2.b();
        if (r0 != 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0025;
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r2.b();
        if (r0 != 0) goto L_0x0027;
    L_0x001e:
        r0 = r2.c();
        if (r0 == 0) goto L_0x0025;
    L_0x0024:
        return r0;
    L_0x0025:
        r0 = r2.g;
    L_0x0027:
        return r0;
    L_0x0028:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtx.a():java.lang.Object");
    }

    private final Object b() {
        String valueOf;
        if (qtx.b("gms:phenotype:phenotype_flag:debug_bypass_phenotype")) {
            valueOf = String.valueOf(this.b);
            String str = "Bypass reading Phenotype values for flag: ";
            Log.w("PhenotypeFlag", valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        } else {
            quk quk = this.f;
            if (quk.b == null) {
                valueOf = quk.a;
                if (valueOf != null) {
                    Context context;
                    String str2 = "direct_boot:";
                    if (qtr.a() && !valueOf.startsWith(str2)) {
                        context = a;
                        if (qtr.a() && !qtr.a(context)) {
                            return null;
                        }
                    }
                    if (this.i == null) {
                        if (this.f.a.startsWith(str2)) {
                            context = a;
                            if (qtr.a()) {
                                context = a.createDeviceProtectedStorageContext();
                            }
                            this.i = context.getSharedPreferences(this.f.a.substring(12), 0);
                        } else {
                            this.i = a.getSharedPreferences(this.f.a, 0);
                        }
                    }
                    SharedPreferences sharedPreferences = this.i;
                    if (sharedPreferences.contains(this.b)) {
                        return a(sharedPreferences);
                    }
                }
            }
            if (this.h == null) {
                ContentResolver contentResolver = a.getContentResolver();
                Uri uri = this.f.b;
                qtw qtw = (qtw) qtw.a.get(uri);
                if (qtw == null) {
                    qtw = new qtw(contentResolver, uri);
                    qtw qtw2 = (qtw) qtw.a.putIfAbsent(uri, qtw);
                    if (qtw2 == null) {
                        qtw.b.registerContentObserver(qtw.c, false, qtw.d);
                    } else {
                        qtw = qtw2;
                    }
                }
                this.h = qtw;
            }
            valueOf = (String) qtx.a(new qua(this, this.h));
            if (valueOf != null) {
                return a(valueOf);
            }
        }
        return null;
    }

    private final Object c() {
        if (!this.f.e && qtx.d()) {
            try {
                String str = (String) qtx.a(new qtz(this));
                if (str != null) {
                    return a(str);
                }
            } catch (SecurityException e) {
                String valueOf = String.valueOf(this.b);
                String str2 = "Unable to read GServices for flag: ";
                Log.e("PhenotypeFlag", valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), e);
            }
        }
        return null;
    }

    private static Object a(qug qug) {
        long clearCallingIdentity;
        try {
            qug = qug.a();
            return qug;
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object a = qug.a();
            return a;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    static boolean b(String str) {
        try {
            if (qtx.d()) {
                return ((Boolean) qtx.a(new quc(str))).booleanValue();
            }
            return false;
        } catch (SecurityException e) {
            Log.e("PhenotypeFlag", "Unable to read GServices, returning default value.", e);
            return false;
        }
    }

    private static boolean d() {
        if (e == null) {
            Context context = a;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (rn.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            }
            e = Boolean.valueOf(z);
        }
        return e.booleanValue();
    }

    /* synthetic */ qtx(quk quk, String str, Object obj) {
        String str2 = quk.a;
        if (str2 == null && quk.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (str2 == null || quk.b == null) {
            this.f = quk;
            str2 = String.valueOf(quk.c);
            String valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            this.c = valueOf;
            String valueOf2 = String.valueOf(quk.d);
            str = String.valueOf(str);
            if (str.length() == 0) {
                str = new String(valueOf2);
            } else {
                str = valueOf2.concat(str);
            }
            this.b = str;
            this.g = obj;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }
}
