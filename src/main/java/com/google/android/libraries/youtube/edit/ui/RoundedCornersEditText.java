package com.google.android.libraries.youtube.edit.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;
import defpackage.amqp;
import defpackage.zsi;
import defpackage.zsj;
import defpackage.zsk;
import defpackage.zsl;

public class RoundedCornersEditText extends EditText {
    public boolean a = true;
    private zsi b = new zsi();

    public RoundedCornersEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(int i) {
        if (this.a) {
            zsi zsi = this.b;
            if (i != zsi.f) {
                zsi.c.setPathEffect(new CornerPathEffect((float) i));
                zsi.f = i;
            }
            invalidate();
        }
    }

    public final void setBackgroundColor(int i) {
        if (this.a) {
            this.b.c.setColor(i);
            invalidate();
            return;
        }
        super.setBackgroundColor(i);
    }

    public final void setTextSize(int i, float f) {
        if (this.a) {
            int i2 = (int) (0.8f * f);
            setPadding(i2, 0, i2, 0);
        }
        super.setTextSize(i, f);
    }

    public final Drawable getBackground() {
        if (this.a) {
            return new ColorDrawable(this.b.c.getColor());
        }
        return super.getBackground();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        if (this.a) {
            zsi zsi = this.b;
            if (!(zsi.c.getColor() == 0 || getText().length() == 0)) {
                int lineCount;
                int length;
                int i;
                StringBuilder stringBuilder = zsi.b;
                stringBuilder.delete(0, stringBuilder.length());
                stringBuilder = zsi.b;
                stringBuilder.append(getText());
                stringBuilder.append(zsi.c.getColor());
                stringBuilder.append(getTextSize());
                stringBuilder.append(getTypeface());
                stringBuilder.append(getTextAlignment());
                int hashCode = zsi.b.toString().hashCode();
                if (hashCode != zsi.e) {
                    zsi.e = hashCode;
                    zsj zsj = zsi.a;
                    zsj.b = 0;
                    zsj.a.clear();
                    lineCount = getLineCount();
                    length = getText().length();
                    for (i = 0; i < lineCount; i++) {
                        int lineStart = getLayout().getLineStart(i);
                        if (lineStart == length || getText().charAt(lineStart) == 10) {
                            zsj.a(0.0f, 0.0f);
                        } else {
                            zsj.a((getLayout().getLineLeft(i) + ((float) getPaddingLeft())) - zsi.a(this), (getLayout().getLineRight(i) + ((float) getPaddingLeft())) + zsi.a(this));
                        }
                    }
                    float textSize = getTextSize() * 0.6f;
                    zsj zsj2 = zsi.a;
                    while (!zsj2.a.isEmpty()) {
                        zsk zsk = (zsk) zsj2.a.poll();
                        amqp a = zsj2.a(zsk.a - 1);
                        if (a.a()) {
                            zsl.a(zsj2, zsk, (zsk) a.b(), textSize);
                        }
                        a = zsj2.a(zsk.a + 1);
                        if (a.a()) {
                            zsl.a(zsj2, zsk, (zsk) a.b(), textSize);
                        }
                    }
                }
                lineCount = 0;
                length = 0;
                for (hashCode = 0; hashCode < getLineCount(); hashCode++) {
                    i = getLayout().getLineStart(hashCode);
                    if (i != getLayout().getLineEnd(hashCode)) {
                        if (getText().charAt(i) == 10) {
                            if (lineCount > 0) {
                                canvas.drawPath(zsi.a(this, length, hashCode - 1), zsi.c);
                                lineCount = 0;
                            }
                            length = hashCode + 1;
                        } else if (hashCode != getLineCount() - 1) {
                            lineCount++;
                        } else {
                            canvas.drawPath(zsi.a(this, length, hashCode), zsi.c);
                        }
                    } else if (lineCount > 0) {
                        canvas.drawPath(zsi.a(this, length, hashCode - 1), zsi.c);
                        lineCount = 0;
                    }
                }
            }
        }
        super.onDraw(canvas);
    }
}
