package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.google.android.libraries.youtube.comment.ui.BackstagePollEditorView;

/* renamed from: wjt */
public final class wjt implements TextWatcher {
    private final /* synthetic */ TextView a;
    private final /* synthetic */ BackstagePollEditorView b;

    public wjt(BackstagePollEditorView backstagePollEditorView, TextView textView) {
        this.b = backstagePollEditorView;
        this.a = textView;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        this.b.a(editable.toString().length(), this.a);
        wjw wjw = this.b.a;
        if (wjw != null) {
            wjw.b();
        }
    }
}
