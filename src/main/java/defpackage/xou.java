package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

/* renamed from: xou */
public final class xou extends ada {
    private final TextView f;
    private final Rect g = new Rect();

    public xou(TextView textView) {
        super(textView);
        this.f = textView;
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(float f, float f2) {
        CharSequence text = this.f.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            TextView textView = this.f;
            int i = -1;
            if (textView.getLayout() != null) {
                i = textView.getLayout().getOffsetForHorizontal(textView.getLayout().getLineForVertical((int) (Math.min((float) ((textView.getHeight() - textView.getTotalPaddingBottom()) - 1), Math.max(0.0f, f2 - ((float) textView.getTotalPaddingTop()))) + ((float) textView.getScrollY()))), Math.min((float) ((textView.getWidth() - textView.getTotalPaddingRight()) - 1), Math.max(0.0f, f - ((float) textView.getTotalPaddingLeft()))) + ((float) textView.getScrollX()));
            }
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(i, i, ClickableSpan.class);
            if (clickableSpanArr.length == 1) {
                return spanned.getSpanStart(clickableSpanArr[0]);
            }
        }
        return aocf.UNSET_ENUM_VALUE;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(List list) {
        CharSequence text = this.f.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            int i = 0;
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
            int length = clickableSpanArr.length;
            while (i < length) {
                list.add(Integer.valueOf(spanned.getSpanStart(clickableSpanArr[i])));
                i++;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, AccessibilityEvent accessibilityEvent) {
        ClickableSpan d = d(i);
        if (d != null) {
            accessibilityEvent.setContentDescription(a(d));
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("LinkSpan is null for offset: ");
        stringBuilder.append(i);
        Log.e("LinkAccessibilityHelper", stringBuilder.toString());
        accessibilityEvent.setContentDescription(this.f.getText());
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, aca aca) {
        ClickableSpan d = d(i);
        String str = "LinkAccessibilityHelper";
        if (d != null) {
            aca.d(a(d));
        } else {
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("LinkSpan is null for offset: ");
            stringBuilder.append(i);
            Log.e(str, stringBuilder.toString());
            aca.d(this.f.getText());
        }
        aca.c(true);
        aca.f(true);
        Rect rect = this.g;
        CharSequence text = this.f.getText();
        rect.setEmpty();
        if (text instanceof Spanned) {
            Layout layout = this.f.getLayout();
            if (layout != null) {
                Spanned spanned = (Spanned) text;
                int spanStart = spanned.getSpanStart(d);
                int spanEnd = spanned.getSpanEnd(d);
                float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                spanStart = layout.getLineForOffset(spanStart);
                spanEnd = layout.getLineForOffset(spanEnd);
                layout.getLineBounds(spanStart, rect);
                if (spanEnd == spanStart) {
                    rect.left = (int) Math.min(primaryHorizontal, primaryHorizontal2);
                    rect.right = (int) Math.max(primaryHorizontal, primaryHorizontal2);
                } else if (layout.getParagraphDirection(spanStart) == -1) {
                    rect.right = (int) primaryHorizontal;
                } else {
                    rect.left = (int) primaryHorizontal;
                }
                rect.offset(this.f.getTotalPaddingLeft(), this.f.getTotalPaddingTop());
            }
        }
        if (this.g.isEmpty()) {
            StringBuilder stringBuilder2 = new StringBuilder(41);
            stringBuilder2.append("LinkSpan bounds is empty for: ");
            stringBuilder2.append(i);
            Log.e(str, stringBuilder2.toString());
            this.g.set(0, 0, 1, 1);
        }
        aca.b(this.g);
        aca.a(16);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c(int i, int i2) {
        if (i2 == 16) {
            ClickableSpan d = d(i);
            if (d != null) {
                d.onClick(this.f);
                return true;
            }
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("LinkSpan is null for offset: ");
            stringBuilder.append(i);
            Log.e("LinkAccessibilityHelper", stringBuilder.toString());
        }
        return false;
    }

    private final ClickableSpan d(int i) {
        CharSequence text = this.f.getText();
        if (text instanceof Spanned) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
            if (clickableSpanArr.length == 1) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    private final CharSequence a(ClickableSpan clickableSpan) {
        CharSequence text = this.f.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }
}
