package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.comment.ui.BackstagePollEditorView;

/* renamed from: wjs */
final /* synthetic */ class wjs implements OnClickListener {
    private final BackstagePollEditorView a;

    wjs(BackstagePollEditorView backstagePollEditorView) {
        this.a = backstagePollEditorView;
    }

    public final void onClick(View view) {
        BackstagePollEditorView backstagePollEditorView = this.a;
        backstagePollEditorView.a("");
        wjw wjw = backstagePollEditorView.a;
        if (wjw != null) {
            wjw.b();
        }
    }
}
