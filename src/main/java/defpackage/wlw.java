package defpackage;

import android.os.Handler;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;

/* renamed from: wlw */
public final class wlw implements TextWatcher {
    private final Handler a = new Handler();
    private wlr[] b;
    private boolean c;

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null && charSequence.length() != 0 && (charSequence instanceof Spanned)) {
            Spanned spanned = (Spanned) charSequence;
            if (i2 > 0) {
                this.b = (wlr[]) spanned.getSpans(i, i2 + i, wlr.class);
                this.c = true;
            } else if (i3 > 0 && i > 0 && i < spanned.length()) {
                wlr[] wlrArr = (wlr[]) spanned.getSpans(i - 1, i, wlr.class);
                i3 = i + 1;
                wlr[] wlrArr2 = (wlr[]) spanned.getSpans(i, i3, wlr.class);
                if (wlrArr != null && wlrArr.length != 0 && wlrArr2 != null && wlrArr2.length != 0) {
                    this.b = (wlr[]) spanned.getSpans(i, i3, wlr.class);
                    this.c = false;
                }
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
        if (editable == null || editable.length() == 0) {
            this.b = null;
            this.c = false;
            return;
        }
        wlr[] wlrArr = this.b;
        if (wlrArr != null) {
            if (this.c) {
                for (wlr wlv : wlrArr) {
                    this.a.post(new wlv(editable, wlv));
                }
            } else {
                for (Object removeSpan : wlrArr) {
                    editable.removeSpan(removeSpan);
                }
            }
        }
        this.b = null;
        this.c = false;
    }
}
