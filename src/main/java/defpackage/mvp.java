package defpackage;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import android.view.View.MeasureSpec;

/* renamed from: mvp */
public final class mvp extends msi implements nfb {
    private final mvo a;
    private TextureView b;

    public mvp(Context context, mvo mvo) {
        super(context);
        this.a = (mvo) amqw.a((Object) mvo);
    }

    public final View b() {
        return this;
    }

    public final void d() {
    }

    public final void e() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        i2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        TextureView textureView = this.b;
        if (textureView != null) {
            textureView.measure(i, i2);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextureView textureView = this.b;
        if (textureView != null) {
            textureView.layout(0, 0, textureView.getMeasuredWidth(), this.b.getMeasuredHeight());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            this.a.c();
        }
    }

    public final void a(TextureView textureView) {
        this.b = textureView;
        addView(textureView);
    }

    public final void f() {
        TextureView textureView = this.b;
        if (textureView != null) {
            removeView(textureView);
        }
        this.b = null;
    }

    public final void g() {
        this.a.a();
    }

    public final void h() {
        this.a.b();
    }

    public final void c() {
        TextureView textureView = this.b;
        if (textureView != null) {
            removeView(textureView);
            addView(this.b);
        }
    }
}
