package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;

/* renamed from: alpe */
public final class alpe {
    public final Drawable a;
    public final CharSequence b;
    public final byte[] c;
    public final apxu d;
    private String e;

    public static String a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(AndroidApplicationEndpointOuterClass.androidAppEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(AndroidApplicationEndpointOuterClass.androidAppEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                return ((aoqo) b).b;
            }
        }
        return null;
    }

    public alpe(PackageManager packageManager, ResolveInfo resolveInfo, apxu apxu, byte[] bArr) {
        amqw.a((Object) packageManager);
        amqw.a((Object) resolveInfo);
        amqw.a((Object) apxu);
        this.e = resolveInfo.activityInfo.name;
        this.a = resolveInfo.loadIcon(packageManager);
        this.b = resolveInfo.loadLabel(packageManager);
        this.c = bArr;
        String str = this.e;
        apxx apxx = (apxx) apxu.d.createBuilder();
        aoqq aoqq = (aoqq) aoqo.f.createBuilder();
        if (resolveInfo.activityInfo.applicationInfo.packageName != null) {
            aoqq.a(resolveInfo.activityInfo.applicationInfo.packageName);
        }
        if (str != null) {
            aoqq.b(str);
        }
        apxx.a(AndroidApplicationEndpointOuterClass.androidAppEndpoint, (aoqo) ((anxl) aoqq.build()));
        apxx.mergeFrom(apxu);
        this.d = (apxu) ((anxl) apxx.build());
    }

    public final String a() {
        if (this.e == null) {
            apxu apxu = this.d;
            if (apxu != null) {
                anxr access$000 = anxl.checkIsLite(AndroidApplicationEndpointOuterClass.androidAppEndpoint);
                apxu.a(access$000);
                if (apxu.h.a(access$000.d)) {
                    apxu = this.d;
                    access$000 = anxl.checkIsLite(AndroidApplicationEndpointOuterClass.androidAppEndpoint);
                    apxu.a(access$000);
                    Object b = apxu.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    this.e = ((aoqo) b).c;
                }
            }
        }
        return this.e;
    }
}
