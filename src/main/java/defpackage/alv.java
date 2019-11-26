package defpackage;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: alv */
public final class alv {
    public TextClassifier a;
    private final TextView b;

    public alv(TextView textView) {
        this.b = (TextView) aad.a((Object) textView);
    }

    public final TextClassifier a() {
        TextClassifier textClassifier = this.a;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.b.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            textClassifier = TextClassifier.NO_OP;
        }
        return textClassifier;
    }
}
