package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: alyf */
public final class alyf {
    public final Context a;
    public final Executor b;
    public final SharedPreferences c;
    public final zzl d;
    public final alyv e;
    public final alyz f;
    public final amce g;
    public final alys h;
    public final ambw i;
    public final xah j;
    public final amae k;
    public final amii l;

    public alyf(Context context, Executor executor, SharedPreferences sharedPreferences, zzl zzl, alyv alyv, alyz alyz, amce amce, alys alys, ambw ambw, xah xah, amae amae, amii amii) {
        this.a = context;
        this.b = executor;
        this.c = sharedPreferences;
        this.d = zzl;
        this.e = alyv;
        this.f = alyz;
        this.g = amce;
        this.h = alys;
        this.i = ambw;
        this.j = xah;
        this.k = amae;
        this.l = amii;
    }

    public final anjv a(afpt afpt) {
        anjv a = anjf.a(new alyl(this, afpt), this.b);
        anjf.a(a, new alyq(this), this.b);
        return a;
    }

    public final void a(afpt afpt, amaq amaq) {
        amqw.a(afpt != afpt.g);
        this.k.a(afpt.a(), amaq);
    }

    public final void a(amaq amaq) {
        this.k.b(amaq);
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        if (VERSION.SDK_INT >= 23 && (this.a.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1 || this.a.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1)) {
            arrayList.add(aytw.UPLOAD_FEATURE_NO_STORAGE_PERMISSION);
        }
        return arrayList;
    }

    public static void a(ContentResolver contentResolver, Uri uri) {
        try {
            contentResolver.takePersistableUriPermission(uri, 1);
        } catch (SecurityException unused) {
        }
    }

    public static void a(amdz amdz, ayva ayva) {
        if (ayva != null) {
            amdy amdy = (amdy) amdv.d.createBuilder();
            boolean z = ayva.b;
            amdy.copyOnWrite();
            amdv amdv = (amdv) amdy.instance;
            int i = 1;
            amdv.a |= 1;
            amdv.b = z;
            int a = ayuy.a(ayva.c);
            if (a == 0) {
                a = 1;
            }
            a--;
            if (a == 1) {
                i = 2;
            } else if (a == 2) {
                i = 3;
            } else if (a == 3) {
                i = 4;
            } else if (a == 4) {
                i = 5;
            } else if (a == 5) {
                i = 6;
            }
            amdy.copyOnWrite();
            amdv amdv2 = (amdv) amdy.instance;
            amdv2.a |= 2;
            amdv2.c = i - 1;
            amdv2 = (amdv) ((anxl) amdy.build());
            amdz.copyOnWrite();
            amea amea = (amea) amdz.instance;
            if (amdv2 != null) {
                amea.R = amdv2;
                amea.b |= 256;
                return;
            }
            throw new NullPointerException();
        }
    }

    static void a(String str, amdz amdz) {
        boolean z = str.lastIndexOf("um=3") >= 0;
        amdz.copyOnWrite();
        amea amea = (amea) amdz.instance;
        amea.a |= 67108864;
        amea.D = z;
    }
}
