package defpackage;

import android.os.Build.VERSION;
import android.support.design.textfield.TextInputLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: lh */
public final class lh extends aaj {
    private final TextInputLayout b;

    public lh(TextInputLayout textInputLayout) {
        this.b = textInputLayout;
    }

    public final void a(View view, aca aca) {
        super.a(view, aca);
        EditText editText = this.b.a;
        CharSequence charSequence = null;
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence b = this.b.b();
        CharSequence e = this.b.e();
        TextInputLayout textInputLayout = this.b;
        if (textInputLayout.b && textInputLayout.d) {
            TextView textView = textInputLayout.e;
            if (textView != null) {
                charSequence = textView.getContentDescription();
            }
        }
        int isEmpty = TextUtils.isEmpty(text) ^ 1;
        int isEmpty2 = TextUtils.isEmpty(b) ^ 1;
        boolean isEmpty3 = TextUtils.isEmpty(e);
        Object obj = ((isEmpty3 ^ 1) == 0 && TextUtils.isEmpty(charSequence)) ? null : 1;
        if (isEmpty != 0) {
            aca.b(text);
        } else if (isEmpty2 != 0) {
            aca.b(b);
        }
        if (isEmpty2 != 0) {
            if (VERSION.SDK_INT >= 26) {
                aca.a.setHintText(b);
            } else if (VERSION.SDK_INT >= 19) {
                aca.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", b);
            }
            int i = isEmpty ^ 1;
            if (VERSION.SDK_INT >= 26) {
                aca.a.setShowingHintText(i);
            } else {
                aca.a(4, i);
            }
        }
        if (obj != null) {
            if (!isEmpty3) {
                charSequence = e;
            }
            if (VERSION.SDK_INT >= 21) {
                aca.a.setError(charSequence);
            }
            if (VERSION.SDK_INT >= 19) {
                aca.a.setContentInvalid(true);
            }
        }
    }

    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        EditText editText = this.b.a;
        CharSequence text = editText != null ? editText.getText() : null;
        if (TextUtils.isEmpty(text)) {
            text = this.b.b();
        }
        if (!TextUtils.isEmpty(text)) {
            accessibilityEvent.getText().add(text);
        }
    }
}
