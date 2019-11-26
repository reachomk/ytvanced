package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

/* renamed from: zmb */
public final class zmb {
    public static Bitmap a(Context context, View view) {
        float f;
        amqw.b(view.getParent() == null);
        Configuration configuration = context.getResources().getConfiguration();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutDirection(configuration.getLayoutDirection());
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        frameLayout.addView(view);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec);
        makeMeasureSpec = frameLayout.getMeasuredWidth();
        int measuredHeight = frameLayout.getMeasuredHeight();
        float f2 = (float) measuredHeight;
        float f3 = (float) makeMeasureSpec;
        float f4 = f3 / f2;
        int i = 2048;
        if (makeMeasureSpec <= 2048 && measuredHeight <= 2048) {
            i = measuredHeight;
            measuredHeight = makeMeasureSpec;
            f = 1.0f;
        } else if (makeMeasureSpec >= measuredHeight) {
            f = 2048.0f / f3;
            i = (int) (2048.0f / f4);
            measuredHeight = 2048;
        } else {
            f = 2048.0f / f2;
            measuredHeight = (int) (f4 * 2048.0f);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams layoutParams2 = new LayoutParams(frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight());
        layoutParams2.gravity = 17;
        view.setLayoutParams(layoutParams2);
        view.setScaleX(f);
        view.setScaleY(f);
        frameLayout.setLayoutParams(new LayoutParams(measuredHeight, i));
        frameLayout.measure(0, 0);
        frameLayout.layout(0, 0, measuredHeight, i);
        Bitmap createBitmap = Bitmap.createBitmap(measuredHeight, i, Config.ARGB_8888);
        frameLayout.draw(new Canvas(createBitmap));
        frameLayout.removeView(view);
        view.setLayoutParams(layoutParams);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        return createBitmap;
    }
}
