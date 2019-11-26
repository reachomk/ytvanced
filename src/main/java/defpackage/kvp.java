package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.List;

/* renamed from: kvp */
public final class kvp extends krl {
    @Deprecated
    private ajyn k;
    private apxu l;
    private long m;

    public kvp(Context context, aaas aaas, vod vod, vmn vmn, tpu tpu, dwk dwk, View view, View view2, View view3, View view4, View view5) {
        super(context, aaas, vod, vmn, tpu, dwk, view, view2, view3, view5, view4);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(View view, MotionEvent motionEvent, List list) {
    }

    public final void a(acvx acvx, Object obj, String str, apxu[] apxuArr, apxu apxu, long j, long j2, ajyn ajyn, aojc aojc, byte[] bArr) {
        this.k = (ajyn) amqw.a((Object) ajyn);
        this.l = apxu;
        this.m = j;
        super.a(acvx, obj, str, apxuArr, ajyn, j2, aojc, bArr);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(View view, MotionEvent motionEvent, List list) {
        b(this.l);
    }

    /* Access modifiers changed, original: protected|final */
    @Deprecated
    public final ajyn d() {
        return this.k;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean e() {
        return this.m == 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view, View view2) {
        amqw.a((Object) view);
        amqw.a((Object) view2);
        long j = this.m;
        amqw.a((Object) view2);
        float f = 0.0f;
        float f2 = (j < 0 || j >= 50) ? 0.0f : ((float) j) / 100.0f;
        int measuredWidth = view2.getMeasuredWidth();
        if (measuredWidth <= 0) {
            measuredWidth = 1000;
        }
        int i = (int) (f2 * ((float) measuredWidth));
        long j2 = this.m;
        amqw.a((Object) view2);
        if (j2 >= 0 && j2 < 50) {
            f = ((float) j2) / 100.0f;
        }
        measuredWidth = view2.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = 1000;
        }
        measuredWidth = (int) (f * ((float) measuredWidth));
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.width = view2.getMeasuredWidth() - (i + i);
        marginLayoutParams.height = view2.getMeasuredHeight() - (measuredWidth + measuredWidth);
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.rightMargin = i;
        marginLayoutParams.topMargin = measuredWidth;
        marginLayoutParams.bottomMargin = measuredWidth;
        view.requestLayout();
    }
}
