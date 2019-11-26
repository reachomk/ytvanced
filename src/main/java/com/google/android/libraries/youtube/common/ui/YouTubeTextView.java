package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.ajqp;
import defpackage.ajqs;
import defpackage.ajrc;
import defpackage.wwy;
import defpackage.xou;
import defpackage.xqj;

public class YouTubeTextView extends TextView {
    private boolean a = false;
    public boolean b;
    public boolean c;
    private boolean d = false;
    private int e;
    private boolean f = false;
    private int g;
    private boolean h = false;
    private int i;
    private xou j;

    public YouTubeTextView(Context context) {
        super(context);
        a(context, null, 0, 0);
    }

    public YouTubeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0, 0);
    }

    public YouTubeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public YouTubeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        if (!isInEditMode()) {
            if (VERSION.SDK_INT < 26) {
                boolean isFocusable = isFocusable();
                this.j = new xou(this);
                abe.a((View) this, this.j);
                setFocusable(isFocusable);
            }
            Theme theme = context.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(null, wwy.H, i, i2);
            a(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, wwy.H, 0, 0);
            i = obtainStyledAttributes2.getResourceId(wwy.I, 0);
            if (i != 0) {
                TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(i, wwy.H);
                a(obtainStyledAttributes3);
                obtainStyledAttributes3.recycle();
            }
            a(obtainStyledAttributes2);
            obtainStyledAttributes2.recycle();
        }
    }

    public final void setTextAppearance(Context context, int i) {
        ajrc a = ajrc.a(-1);
        if (a != null) {
            setTypeface(a.a(getContext(), 0), 0);
        }
        this.e = 0;
        this.g = 0;
        this.i = 0;
        this.d = false;
        this.f = false;
        this.h = false;
        super.setTextAppearance(context, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i, wwy.H);
        a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    private final void a(TypedArray typedArray) {
        if (!isInEditMode()) {
            int indexCount = typedArray.getIndexCount();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArray.getIndex(i5);
                if (index == wwy.K) {
                    this.c = typedArray.getBoolean(index, false);
                } else if (index == wwy.J) {
                    i4 = typedArray.getInt(index, i4);
                } else if (index == wwy.L) {
                    i2 = typedArray.getInt(index, i2);
                } else if (index == wwy.P) {
                    i3 = typedArray.getInt(index, i3);
                } else if (index == wwy.M) {
                    this.e = typedArray.getColor(index, 0);
                    this.d = true;
                } else if (index == wwy.N) {
                    this.g = typedArray.getColor(index, 0);
                    this.f = true;
                } else if (index == wwy.O) {
                    this.i = typedArray.getDimensionPixelSize(index, 0);
                    this.h = true;
                }
            }
            Context context = getContext();
            if (i2 != -1) {
                ajrc a = ajrc.a(i2);
                if (a != null) {
                    setTypeface(a.a(context, i4), i4);
                }
            } else if (i3 != -1) {
                ajrc ajrc;
                ajrc[] values = ajrc.values();
                int length = values.length;
                while (i < length) {
                    ajrc = values[i];
                    if (ajrc.e == i3) {
                        break;
                    }
                    i++;
                }
                ajrc = null;
                if (ajrc != null) {
                    setTypeface(ajrc.a(context, i4), i4);
                }
            }
        }
    }

    public final void setText(CharSequence charSequence, BufferType bufferType) {
        if (charSequence instanceof Spanned) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.strike_through_line_width);
            int i = 0;
            for (ajqp ajqp : (ajqp[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ajqp.class)) {
                if (this.d) {
                    ajqp.a.setColor(this.e);
                    ajqp.b = true;
                }
                ajqp.a.setStrokeWidth((float) dimensionPixelSize);
            }
            if (this.h) {
                dimensionPixelSize = this.i;
            } else {
                dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.underline_line_width);
            }
            ajqs[] ajqsArr = (ajqs[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ajqs.class);
            int length = ajqsArr.length;
            while (i < length) {
                ajqs ajqs = ajqsArr[i];
                if (this.f) {
                    ajqs.a.setColor(this.g);
                    ajqs.b = true;
                }
                ajqs.a.setStrokeWidth((float) dimensionPixelSize);
                i++;
            }
        }
        super.setText(charSequence, bufferType);
        c();
    }

    public final void c() {
        if (this.c) {
            CharSequence text = getText();
            if (!(text instanceof Spanned) || ((ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class)).length <= 0) {
                e();
            } else {
                d();
            }
        }
    }

    public final void d() {
        this.a = true;
        setMovementMethod(xqj.a());
    }

    public final void e() {
        this.a = false;
        setMovementMethod(getDefaultMovementMethod());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a) {
            return super.onTouchEvent(motionEvent);
        }
        this.b = false;
        super.onTouchEvent(motionEvent);
        return this.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT >= 26 || !this.j.a(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }
}
