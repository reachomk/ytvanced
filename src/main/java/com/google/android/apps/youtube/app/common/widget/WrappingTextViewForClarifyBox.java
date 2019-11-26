package com.google.android.apps.youtube.app.common.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import defpackage.fpv;
import java.util.Collections;
import java.util.List;

public class WrappingTextViewForClarifyBox extends TextView {
    public List a = Collections.emptyList();
    public int b = 0;
    public int c;
    public fpv d;
    private SpannableString e;
    private CharSequence f;
    private int g = 0;

    public WrappingTextViewForClarifyBox(Context context) {
        super(context);
    }

    public WrappingTextViewForClarifyBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WrappingTextViewForClarifyBox(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        if (this.a.size() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            int size = MeasureSpec.getMode(i) != 0 ? MeasureSpec.getSize(i) : Integer.MAX_VALUE;
            int i3 = size - this.c;
            StringBuilder stringBuilder2 = new StringBuilder();
            this.g = 0;
            int i4 = 0;
            int i5 = 0;
            for (CharSequence charSequence : this.a) {
                i4 += charSequence.length();
                int i6 = stringBuilder2.length() == 0 ? 1 : 0;
                if (!TextUtils.isEmpty(charSequence)) {
                    if (i6 == 0 && i4 != this.b) {
                        stringBuilder2.append(" ");
                        i4++;
                    }
                    stringBuilder2.append(charSequence);
                    int maxLines = getMaxLines() - 1;
                    Object obj = i5 != maxLines ? null : 1;
                    float f = (float) size;
                    Object obj2 = getPaint().measureText(stringBuilder2.toString()) <= f ? 1 : null;
                    if (obj != null) {
                        obj2 = getPaint().measureText(stringBuilder2.toString()) <= ((float) i3) ? 1 : null;
                    }
                    if (i5 == maxLines) {
                        if (obj2 == null) {
                            CharSequence ellipsize = TextUtils.ellipsize(stringBuilder2, getPaint(), (float) i3, TruncateAt.END);
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(ellipsize);
                            break;
                        }
                    } else if (obj2 == null) {
                        CharSequence ellipsize2;
                        int i7 = i6 ^ 1;
                        if (i7 != 0) {
                            stringBuilder2.delete(stringBuilder2.length() - charSequence.length(), stringBuilder2.length());
                        }
                        if (i6 != 0) {
                            ellipsize2 = TextUtils.ellipsize(stringBuilder2, getPaint(), f, TruncateAt.END);
                        } else {
                            ellipsize2 = stringBuilder2.toString();
                        }
                        stringBuilder.append(ellipsize2);
                        i5++;
                        if (i7 == 0) {
                            stringBuilder2 = new StringBuilder();
                        } else {
                            stringBuilder2 = new StringBuilder(charSequence);
                        }
                    }
                }
            }
            if (stringBuilder2.length() != 0) {
                stringBuilder.append(stringBuilder2);
            }
            this.g = stringBuilder2.length() != 0 ? (int) (((float) i3) - getPaint().measureText(stringBuilder2.toString())) : -1;
            this.f = stringBuilder.subSequence(0, stringBuilder.length());
            this.e = new SpannableString(this.f);
            this.e.setSpan(new StyleSpan(1), 0, this.b, 18);
            setText(this.e);
            fpv fpv = this.d;
            if (fpv != null) {
                fpv.a(this.g);
            }
        }
        super.onMeasure(i, i2);
    }
}
