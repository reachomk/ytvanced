package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: kvz */
final /* synthetic */ class kvz implements OnClickListener {
    private final kvw a;

    kvz(kvw kvw) {
        this.a = kvw;
    }

    public final void onClick(View view) {
        kvw kvw = this.a;
        kvx kvx = kvw.j;
        ImageView imageView = kvw.f;
        ajzj ajzj = kvx.d;
        if (ajzj != null && ajzj.g != null) {
            apxu[] a = kqv.a(ajzj.j);
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", kvx.d);
            kvx.c.a(a, hashMap);
            aaas aaas = kvx.c;
            ajzj ajzj2 = kvx.d;
            apxu apxu = ajzj2.g;
            if (ajzj2.a != null) {
                HashMap hashMap2 = new HashMap(hashMap);
                hashMap2.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", kvx.d.a);
                if (imageView != null) {
                    hashMap2.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", imageView);
                }
                hashMap = hashMap2;
            }
            aaas.a(apxu, hashMap);
        }
    }
}
