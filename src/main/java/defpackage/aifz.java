package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.libraries.youtube.player.subtitles.ui.SubtitleWindowView;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: aifz */
public class aifz extends aiuc implements aifi {
    private final SparseArray a = new SparseArray();
    private final SparseArray b = new SparseArray();
    private float c = 1.0f;
    private float d;
    private int e = 0;
    private int f = 0;
    private ajji g;

    public aifz(Context context) {
        super(context);
        this.d = (float) context.getResources().getDimensionPixelSize(R.dimen.medium_font_size);
        this.g = new ajji(ajjn.c(), ajjn.d(), ajjn.h(), ajjq.a(), ajjn.g(), ajjp.a());
        d();
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void a(List list) {
        int i;
        HashSet hashSet = new HashSet();
        for (i = 0; i < this.a.size(); i++) {
            hashSet.add(Integer.valueOf(this.a.keyAt(i)));
        }
        for (i = 0; i < list.size(); i++) {
            ajjc ajjc = (ajjc) list.get(i);
            hashSet.remove(Integer.valueOf(ajjc.a));
            SubtitleWindowView subtitleWindowView = (SubtitleWindowView) this.b.get(ajjc.a);
            if (!TextUtils.isEmpty(ajjc.c) && ajjc.b.e) {
                this.a.put(ajjc.a, ajjc);
                if (subtitleWindowView == null) {
                    CharSequence charSequence = ajjc.c;
                    SubtitleWindowView subtitleWindowView2 = new SubtitleWindowView(getContext());
                    a(subtitleWindowView2);
                    subtitleWindowView2.setTag(charSequence);
                    subtitleWindowView2.a(ajjc);
                    addView(subtitleWindowView2);
                    this.b.put(ajjc.a, subtitleWindowView2);
                } else {
                    if (!ajjc.c.equals(subtitleWindowView.getTag())) {
                        subtitleWindowView.setTag(ajjc.c);
                        subtitleWindowView.a(ajjc);
                    }
                    subtitleWindowView.setVisibility(0);
                }
            } else if (subtitleWindowView != null) {
                subtitleWindowView.setVisibility(8);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            removeView((View) this.b.get(intValue));
            this.a.remove(intValue);
            this.b.remove(intValue);
        }
        setVisibility(0);
    }

    public final void c() {
        removeAllViews();
        this.a.clear();
        this.b.clear();
    }

    public final void d() {
        setVisibility(4);
    }

    public final void a(float f) {
        this.c = f;
        b(getWidth(), getHeight());
    }

    public final void a(ajji ajji) {
        this.g = ajji;
        b(getWidth(), getHeight());
    }

    public final void a(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    private final void b(int i, int i2) {
        this.d = ajjl.a(getContext(), this.c, i, i2);
        for (i = 0; i < this.b.size(); i++) {
            a((SubtitleWindowView) this.b.valueAt(i));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    public final void onMeasure(int r8, int r9) {
        /*
        r7 = this;
        r8 = android.view.View.MeasureSpec.getSize(r8);
        r9 = android.view.View.MeasureSpec.getSize(r9);
        r7.setMeasuredDimension(r8, r9);
        r7.b(r8, r9);
        r0 = 0;
        r1 = 0;
    L_0x0010:
        r2 = r7.a;
        r2 = r2.size();
        if (r1 >= r2) goto L_0x008e;
    L_0x0018:
        r2 = r7.b;
        r3 = r7.a;
        r3 = r3.keyAt(r1);
        r2 = r2.get(r3);
        r2 = (com.google.android.libraries.youtube.player.subtitles.ui.SubtitleWindowView) r2;
        r3 = r2.getVisibility();
        if (r3 != 0) goto L_0x008b;
    L_0x002c:
        r3 = r7.a;
        r3 = r3.valueAt(r1);
        r3 = (defpackage.ajjc) r3;
        r3 = r3.b;
        r4 = r3.b;
        r5 = r3.c;
        r5 = r5 * r8;
        r5 = r5 / 100;
        r3 = r3.d;
        r3 = r3 * r9;
        r3 = r3 / 100;
        r6 = r4 & 1;
        if (r6 == 0) goto L_0x004e;
    L_0x0048:
        r5 = r8 - r5;
        r6 = r7.f;
    L_0x004c:
        r5 = r5 - r6;
        goto L_0x0068;
    L_0x004e:
        r6 = r4 & 2;
        if (r6 == 0) goto L_0x005f;
    L_0x0052:
        r6 = r8 - r5;
        r5 = java.lang.Math.min(r5, r6);
        r5 = r5 + r5;
        r6 = r7.e;
        r5 = r5 - r6;
        r6 = r7.f;
        goto L_0x004c;
    L_0x005f:
        r6 = r4 & 4;
        if (r6 != 0) goto L_0x0065;
    L_0x0063:
        r5 = 0;
        goto L_0x0068;
    L_0x0065:
        r6 = r7.e;
        goto L_0x004c;
    L_0x0068:
        r6 = r4 & 8;
        if (r6 == 0) goto L_0x006f;
    L_0x006c:
        r3 = r9 - r3;
        goto L_0x0080;
    L_0x006f:
        r6 = r4 & 16;
        if (r6 == 0) goto L_0x007b;
    L_0x0073:
        r4 = r9 - r3;
        r3 = java.lang.Math.min(r3, r4);
        r3 = r3 + r3;
        goto L_0x0080;
    L_0x007b:
        r4 = r4 & 32;
        if (r4 != 0) goto L_0x0080;
    L_0x007f:
        r3 = 0;
    L_0x0080:
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0);
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0);
        r2.measure(r4, r3);
    L_0x008b:
        r1 = r1 + 1;
        goto L_0x0010;
    L_0x008e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aifz.onMeasure(int, int):void");
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        /*
        r8 = this;
        r12 = r12 - r10;
        r13 = r13 - r11;
        r9 = r12 * 15;
        r9 = r9 / 100;
        r9 = r9 / 2;
        r10 = r13 * 15;
        r10 = r10 / 100;
        r10 = r10 / 2;
        r12 = r12 * 85;
        r12 = r12 / 100;
        r13 = r13 * 85;
        r13 = r13 / 100;
        r11 = 0;
        r0 = 0;
    L_0x0018:
        r1 = r8.a;
        r1 = r1.size();
        if (r0 >= r1) goto L_0x0090;
    L_0x0020:
        r1 = r8.b;
        r2 = r8.a;
        r2 = r2.keyAt(r0);
        r1 = r1.get(r2);
        r1 = (com.google.android.libraries.youtube.player.subtitles.ui.SubtitleWindowView) r1;
        r2 = r1.getVisibility();
        if (r2 != 0) goto L_0x008d;
    L_0x0034:
        r2 = r8.a;
        r2 = r2.valueAt(r0);
        r2 = (defpackage.ajjc) r2;
        r3 = r1.getMeasuredWidth();
        r4 = r1.getMeasuredHeight();
        r2 = r2.b;
        r5 = r2.b;
        r6 = r2.c;
        r6 = r6 * r12;
        r6 = r6 / 100;
        r7 = r2.d;
        r7 = r7 * r13;
        r7 = r7 / 100;
        r2 = r2.f;
        if (r2 != 0) goto L_0x006e;
    L_0x0058:
        r2 = r5 & 1;
        if (r2 != 0) goto L_0x006c;
    L_0x005c:
        r2 = r5 & 2;
        if (r2 == 0) goto L_0x0065;
    L_0x0060:
        r2 = r3 / 2;
        r2 = r6 - r2;
        goto L_0x006f;
    L_0x0065:
        r2 = r5 & 4;
        if (r2 == 0) goto L_0x006e;
    L_0x0069:
        r2 = r6 - r3;
        goto L_0x006f;
    L_0x006c:
        r2 = r6;
        goto L_0x006f;
    L_0x006e:
        r2 = 0;
    L_0x006f:
        r6 = r5 & 8;
        if (r6 != 0) goto L_0x0085;
    L_0x0073:
        r6 = r5 & 16;
        if (r6 == 0) goto L_0x007c;
    L_0x0077:
        r5 = r4 / 2;
        r5 = r7 - r5;
        goto L_0x0086;
    L_0x007c:
        r5 = r5 & 32;
        if (r5 == 0) goto L_0x0083;
    L_0x0080:
        r5 = r7 - r4;
        goto L_0x0086;
    L_0x0083:
        r5 = 0;
        goto L_0x0086;
    L_0x0085:
        r5 = r7;
    L_0x0086:
        r2 = r2 + r9;
        r5 = r5 + r10;
        r3 = r3 + r2;
        r4 = r4 + r5;
        r1.layout(r2, r5, r3, r4);
    L_0x008d:
        r0 = r0 + 1;
        goto L_0x0018;
    L_0x0090:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aifz.onLayout(boolean, int, int, int, int):void");
    }

    private final void a(SubtitleWindowView subtitleWindowView) {
        subtitleWindowView.a(this.d);
        subtitleWindowView.d(this.g.a);
        subtitleWindowView.setBackgroundColor(this.g.b);
        subtitleWindowView.a(this.g.e);
        subtitleWindowView.a(ajjp.a(getContext(), this.g));
        subtitleWindowView.b(this.g.c);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.subtitles_overlay_padding);
        subtitleWindowView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        subtitleWindowView.c(this.g.d);
    }
}
