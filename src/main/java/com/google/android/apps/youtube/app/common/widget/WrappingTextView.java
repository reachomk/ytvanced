package com.google.android.apps.youtube.app.common.widget;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import defpackage.amul;
import java.util.ArrayList;
import java.util.List;

public class WrappingTextView extends TextView {
    private static final amul b = amul.g();
    public List a = b;
    private StringBuilder c;
    private StringBuilder d;
    private int e = MeasureSpec.makeMeasureSpec(0, 1073741824);
    private boolean f = true;

    public WrappingTextView(Context context) {
        super(context);
    }

    public WrappingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WrappingTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final void a(List list) {
        if (list == null) {
            list = b;
        }
        if (this.a.equals(list)) {
            if (list.isEmpty() && !TextUtils.isEmpty(getText())) {
                setText(null);
            }
            return;
        }
        if (!(list instanceof amul)) {
            list = new ArrayList(list);
        }
        this.a = list;
        if (this.a.isEmpty()) {
            this.f = false;
            setText(null);
            return;
        }
        this.f = true;
        requestLayout();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        if (!this.a.isEmpty() && (this.e != i || this.f)) {
            int size = ((MeasureSpec.getMode(i) != 0 ? MeasureSpec.getSize(i) : Integer.MAX_VALUE) - getPaddingLeft()) - getPaddingRight();
            int maxLines = getMaxLines() - 1;
            StringBuilder stringBuilder = this.c;
            if (stringBuilder == null) {
                this.c = new StringBuilder();
                this.d = new StringBuilder();
            } else {
                stringBuilder.setLength(0);
                this.d.setLength(0);
            }
            int size2 = this.a.size();
            int i3 = 0;
            Object obj = null;
            for (int i4 = 0; i4 < size2 && i3 <= maxLines; i4++) {
                if (!TextUtils.isEmpty((CharSequence) this.a.get(i4))) {
                    String charSequence = ((CharSequence) this.a.get(i4)).toString();
                    if (obj != null) {
                        this.c.append(10);
                    }
                    boolean isEmpty = TextUtils.isEmpty(this.d);
                    int length = this.d.length();
                    if (!isEmpty) {
                        this.d.append(" · ");
                    }
                    this.d.append(charSequence);
                    float f = (float) size;
                    if (getPaint().measureText(this.d.toString()) < f) {
                        obj = null;
                    } else {
                        if (i3 == maxLines || isEmpty) {
                            this.c.append(a(this.d, f));
                            this.d.setLength(0);
                            obj = 1;
                        } else {
                            this.c.append(this.d, 0, length);
                            this.c.append(10);
                            this.d.setLength(0);
                            this.d.append(a(charSequence, f));
                            obj = null;
                        }
                        i3++;
                    }
                }
            }
            if (!TextUtils.isEmpty(this.d)) {
                this.c.append(this.d);
            }
            setText(this.c);
            this.e = i;
            this.f = false;
        }
        super.onMeasure(i, i2);
    }

    private final CharSequence a(CharSequence charSequence, float f) {
        return TextUtils.ellipsize(charSequence, getPaint(), f, TruncateAt.END);
    }
}
