package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.settings.SettingsActivity;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: fto */
public final class fto implements aaap {
    public final Context a;
    private final abim b;
    private final xhv c;
    private final ebk d;
    private final Executor e;

    public fto(Context context, abim abim, xhv xhv, ebk ebk, Executor executor) {
        this.a = context;
        this.b = abim;
        this.c = xhv;
        this.d = ebk;
        this.e = executor;
    }

    public final void a(apxu apxu, Map map) {
        Intent intent = new Intent(this.a, SettingsActivity.class);
        anxr access$000 = anxl.checkIsLite(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aoxe aoxe = (aoxe) b;
        if (this.c.c() && !this.d.a && aoxe.b) {
            ftp ftp = new ftp(this, intent);
            abim abim = this.b;
            anjv a = abim.a(abim.a(aoxe.c));
            Executor executor = this.e;
            ftn ftn = new ftn(ftp);
            ftp.getClass();
            xan.a(a, executor, ftn, new ftq(ftp), ankh.a);
            return;
        }
        intent.putExtra("show_offline_items", this.d.a);
        fto.a(intent, aoxe.d);
        this.a.startActivity(intent);
    }

    public static void a(Intent intent, String str) {
        if (!TextUtils.isEmpty(str)) {
            str = (String) jbm.a.get(str);
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra(":android:show_fragment", str);
            }
        }
    }
}
