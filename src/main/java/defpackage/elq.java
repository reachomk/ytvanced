package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* renamed from: elq */
public final class elq {
    public static final boolean a(aizy aizy) {
        return aizy.q() != null;
    }

    public static aakj b(aizy aizy) {
        return (aizy == null || aizy.q() == null) ? null : aizy.q().b();
    }

    public static avsj c(aizy aizy) {
        aakj b = elq.b(aizy);
        return b != null ? aiqr.b(b.l()) : null;
    }

    public static final void a(akkq akkq, elv elv, ImageView imageView, String str, aygk aygk, akko akko) {
        amqw.a((Object) akkq);
        amqw.a((Object) elv);
        amqw.a((Object) imageView);
        akkq.a(imageView);
        ely a = elv.a(str);
        Bitmap a2 = a != null ? a.a() : null;
        if (a2 == null || a2.isRecycled()) {
            if (aygk != null) {
                if (akko == null) {
                    akko = akko.g;
                }
                imageView.setScaleType(ScaleType.CENTER_CROP);
                akkq.a(imageView, aygk, akko);
            }
            return;
        }
        imageView.setScaleType(a.b);
        imageView.setImageBitmap(a.a());
    }

    public static apxu a(aiqq aiqq) {
        apxu apxu = aiqq.b;
        if (apxu != null) {
            return apxu;
        }
        apxx apxx;
        if (aiqq.m()) {
            apxx = (apxx) ((anxo) aiqo.a(aiqq.b(), aiqq.c(), aiqq.d()).toBuilder());
        } else {
            apxx = (apxx) ((anxo) airn.a(aiqq.b(), aiqq.c(), aiqq.d(), 0.0f).toBuilder());
        }
        apxx.a(anvu.a(aiqq.k()));
        return (apxu) ((anxl) apxx.build());
    }

    public static String a(apxu apxu) {
        amqw.a((Object) apxu);
        anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
        apxu.a(access$000);
        Object b;
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
            apxu.a(access$000);
            b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            String str = ((azje) b).p;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return str;
        }
        access$000 = anxl.checkIsLite(OfflineWatchEndpointOuterClass.offlineWatchEndpoint);
        apxu.a(access$000);
        if (!apxu.h.a(access$000.d)) {
            return null;
        }
        access$000 = anxl.checkIsLite(OfflineWatchEndpointOuterClass.offlineWatchEndpoint);
        apxu.a(access$000);
        b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        return ((avsc) b).b;
    }

    public static boolean b(apxu apxu) {
        amqw.a((Object) apxu);
        aiqs a = aiqq.a();
        a.a = apxu;
        aiqq b = a.b();
        String str = "";
        return (str.equals(b.b()) && str.equals(b.c())) ? false : true;
    }
}
