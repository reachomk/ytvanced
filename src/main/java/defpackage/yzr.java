package defpackage;

import android.graphics.Rect;
import android.text.Spannable;
import android.text.method.TransformationMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

/* renamed from: yzr */
final class yzr implements TransformationMethod {
    private final zas a;

    yzr(zas zas) {
        this.a = (zas) amqw.a((Object) zas);
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        TextView textView = (TextView) view;
        Linkify.addLinks(textView, 1);
        if (textView.getText() instanceof Spannable) {
            charSequence = (Spannable) textView.getText();
            URLSpan[] uRLSpanArr = (URLSpan[]) charSequence.getSpans(0, textView.length(), URLSpan.class);
            int length = uRLSpanArr.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                Object obj = uRLSpanArr[length];
                int spanStart = charSequence.getSpanStart(obj);
                int spanEnd = charSequence.getSpanEnd(obj);
                String url = obj.getURL();
                charSequence.removeSpan(obj);
                charSequence.setSpan(new yzo(url, this.a), spanStart, spanEnd, 33);
            }
        }
        return charSequence;
    }
}
