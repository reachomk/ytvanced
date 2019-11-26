package defpackage;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.google.android.libraries.youtube.comment.image.ImageViewerActivity;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: wim */
final /* synthetic */ class wim implements OnClickListener {
    private final wih a;
    private final ajsn b;
    private final acvx c;
    private final Map d;
    private final boolean e;

    wim(wih wih, ajsn ajsn, acvx acvx, Map map, boolean z) {
        this.a = wih;
        this.b = ajsn;
        this.c = acvx;
        this.d = map;
        this.e = z;
    }

    public final void onClick(View view) {
        wih wih = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        boolean z = this.e;
        Drawable drawable = ((ImageView) wih.y.findViewById(R.id.image_view)).getDrawable();
        boolean z2 = false;
        Object obj4 = ((drawable instanceof BitmapDrawable) || (drawable instanceof ss)) ? null : 1;
        boolean a = whz.a(wih.f);
        if (obj4 != null && a) {
            z2 = true;
        }
        obj4 = wih.a;
        Object obj5 = wih.e;
        amqw.a(obj4);
        amqw.a(obj);
        ImageViewerActivity.l = (wlm) amqw.a(obj5);
        amqw.a(obj2);
        ImageViewerActivity.k = (Map) amqw.a(obj3);
        aygk aygk = obj.k.e.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        String str = aklb.a(aygk, 4096, 4096).b;
        Spanned a2 = ajqy.a(obj.a);
        Spanned a3 = ajqy.a(obj.e);
        Spanned a4 = ajqy.a(obj.m);
        Intent intent = new Intent(obj4, ImageViewerActivity.class);
        intent.putExtra("commentRenderer", aocf.toByteArray(obj));
        intent.putExtra("imageUrl", str);
        intent.putExtra("timestamp", a3);
        intent.putExtra("isInDetailView", z);
        intent.putExtra("shouldAnimate", z2);
        if (!TextUtils.isEmpty(a2)) {
            intent.putExtra("authorText", a2);
        }
        if (a4 != null && a4.length() > 0) {
            intent.putExtra("likeCount", a4);
        }
        wih.a.startActivity(intent);
    }
}
