package com.google.android.libraries.youtube.share.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import defpackage.abe;
import defpackage.akle;
import defpackage.aleh;
import defpackage.alpb;
import defpackage.amqw;
import defpackage.aygk;
import defpackage.xnk;
import defpackage.xss;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ConversationIconView extends ViewGroup {
    private final SparseArray a = new SparseArray();
    private final SparseArray b = new SparseArray();
    private final HashSet c = new HashSet();
    private final Paint d = new Paint(1);
    private final Paint e = new Paint();
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private int j;
    private int k;
    private int l;
    private TextView m;
    private ImageView n;
    private Canvas o;

    public ConversationIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aleh.b);
        this.f = obtainStyledAttributes.getColor(aleh.d, -1);
        this.g = obtainStyledAttributes.getColor(aleh.c, -1728053248);
        this.h = obtainStyledAttributes.getDimensionPixelSize(aleh.e, xss.a(displayMetrics, 12));
        this.i = obtainStyledAttributes.getDimensionPixelSize(aleh.f, xss.a(displayMetrics, 1));
        int color = obtainStyledAttributes.getColor(4, -1);
        obtainStyledAttributes.recycle();
        this.m = null;
        this.n = null;
        this.e.setColor(color);
        setWillNotDraw(false);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            a((View) this.a.valueAt(i3), this.a.keyAt(i3), measuredWidth, measuredHeight);
        }
        if (this.m != null) {
            ImageView imageView = this.n;
            if (imageView != null) {
                a(imageView, 2, measuredWidth, measuredHeight);
                a(this.m, 2, measuredWidth, measuredHeight);
            }
        }
        measureChildren(i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        for (int i5 = 0; i5 < this.a.size(); i5++) {
            a((View) this.a.valueAt(i5), this.a.keyAt(i5), paddingLeft, paddingTop, paddingRight, paddingBottom);
            int keyAt = this.b.keyAt(i5);
            int g = abe.g(this);
            Object obj = g != 1 ? null : 1;
            Path path = (Path) this.b.get(keyAt);
            float f;
            if (keyAt == 1 || keyAt == 2) {
                path.addRect((float) a(paddingLeft, paddingRight, true), (float) paddingTop, (float) a(paddingLeft, paddingRight, false), (float) paddingBottom, Direction.CW);
            } else if (keyAt == 3) {
                path.addRect((float) a(paddingLeft, paddingRight, true), (float) paddingTop, (float) a(paddingLeft, paddingRight, false), (float) a(paddingTop, paddingBottom, false), Direction.CW);
                if (obj == null) {
                    f = (float) paddingLeft;
                } else {
                    f = (float) a(paddingLeft, paddingRight, true);
                }
                path.addRect(f, (float) a(paddingTop, paddingBottom, true), g != 1 ? (float) a(paddingLeft, paddingRight, false) : (float) paddingRight, (float) a(paddingTop, paddingBottom, false), Direction.CW);
            } else if (keyAt == 4) {
                path.addRect((float) a(paddingLeft, paddingRight, true), (float) a(paddingTop, paddingBottom, true), (float) a(paddingLeft, paddingRight, false), (float) paddingBottom, Direction.CW);
                if (obj == null) {
                    f = (float) paddingLeft;
                } else {
                    f = (float) a(paddingLeft, paddingRight, true);
                }
                path.addRect(f, (float) a(paddingTop, paddingBottom, true), g != 1 ? (float) a(paddingLeft, paddingRight, false) : (float) paddingRight, (float) a(paddingTop, paddingBottom, false), Direction.CW);
            }
        }
        if (this.m != null) {
            ImageView imageView = this.n;
            if (imageView != null) {
                int i6 = paddingLeft;
                int i7 = paddingTop;
                int i8 = paddingRight;
                int i9 = paddingBottom;
                a(imageView, 2, i6, i7, i8, i9);
                a(this.m, 2, i6, i7, i8, i9);
                a(2);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i3 = i / 2;
        this.j = i3;
        i4 = i2 / 2;
        this.k = i4;
        this.l = Math.min(i3, i4);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        this.o = new Canvas(createBitmap);
        this.d.setShader(new BitmapShader(createBitmap, TileMode.CLAMP, TileMode.CLAMP));
    }

    /* Access modifiers changed, original: protected|final */
    public final void dispatchDraw(Canvas canvas) {
        this.o.drawColor(0, Mode.CLEAR);
        super.dispatchDraw(this.o);
        canvas.drawCircle((float) this.j, (float) this.k, (float) this.l, this.d);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (this.b.get(intValue) != null) {
                canvas.drawPath((Path) this.b.get(intValue), this.e);
            }
        }
    }

    public final void a(List list, xnk xnk, CharSequence charSequence) {
        if (!list.isEmpty()) {
            int min = Math.min(list.size(), 3);
            removeAllViews();
            this.a.clear();
            this.b.clear();
            this.c.clear();
            this.m = null;
            this.n = null;
            boolean z = true;
            if (min == 1) {
                b(0);
            } else if (min == 2) {
                b(1);
                b(2);
            } else if (min == 3) {
                b(3);
                b(4);
                b(2);
            }
            if (min != this.a.size()) {
                z = false;
            }
            amqw.b(z);
            for (min = 0; min < this.a.size(); min++) {
                ImageView imageView = (ImageView) this.a.valueAt(min);
                int keyAt = this.a.keyAt(min);
                akle akle = new akle(xnk, imageView);
                akle.a(ScaleType.CENTER_CROP);
                akle.a((aygk) list.get(min), new alpb(this, keyAt));
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.n = new ImageView(getContext());
                addView(this.n);
                this.m = new YouTubeTextView(getContext());
                addView(this.m);
                this.n.setBackground(new ColorDrawable(this.g));
                this.m.setText(charSequence);
                this.m.setTextSize(0, (float) this.h);
                this.m.setTextColor(this.f);
                this.m.setGravity(17);
            }
        }
    }

    private final ImageView b(int i) {
        ImageView imageView = new ImageView(getContext());
        addView(imageView);
        this.a.put(i, imageView);
        this.b.put(i, new Path());
        return imageView;
    }

    private final void a(View view, int i, int i2, int i3) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (i != 0) {
            i2 = a(0, i2, true);
        }
        layoutParams.width = i2;
        if (!(i == 0 || i == 1 || i == 2)) {
            i3 = a(0, i3, true);
        }
        layoutParams.height = i3;
    }

    private final void a(View view, int i, int i2, int i3, int i4, int i5) {
        int g = abe.g(this);
        Object obj = g != 1 ? null : 1;
        if (i == 0) {
            view.layout(i2, i3, i4, i5);
        } else if (i == 1) {
            i = obj != null ? a(i2, i4, false) : i2;
            if (g != 1) {
                i4 = a(i2, i4, true);
            }
            view.layout(i, i3, i4, i5);
        } else if (i == 2) {
            i = g != 1 ? a(i2, i4, false) : i2;
            if (obj != null) {
                i4 = a(i2, i4, true);
            }
            view.layout(i, i3, i4, i5);
        } else if (i != 3) {
            if (i == 4) {
                i = obj != null ? a(i2, i4, false) : i2;
                i3 = a(i3, i5, false);
                if (g != 1) {
                    i4 = a(i2, i4, true);
                }
                view.layout(i, i3, i4, i5);
            }
        } else {
            i = obj != null ? a(i2, i4, false) : i2;
            if (g != 1) {
                i4 = a(i2, i4, true);
            }
            view.layout(i, i3, i4, a(i3, i5, true));
        }
    }

    private final int a(int i, int i2, boolean z) {
        return Math.round((((float) (i + i2)) * 0.5f) + ((((float) this.i) * 0.5f) * ((float) (!z ? 1 : -1))));
    }

    public final boolean a(int i) {
        if (this.b.indexOfKey(i) == -1) {
            return false;
        }
        this.c.add(Integer.valueOf(i));
        return true;
    }
}
