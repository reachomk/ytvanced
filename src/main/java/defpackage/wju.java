package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.comment.ui.BackstagePollEditorView;

/* renamed from: wju */
public final /* synthetic */ class wju implements OnClickListener {
    private final BackstagePollEditorView a;
    private final View b;

    public wju(BackstagePollEditorView backstagePollEditorView, View view) {
        this.a = backstagePollEditorView;
        this.b = view;
    }

    public final void onClick(View view) {
        BackstagePollEditorView backstagePollEditorView = this.a;
        View view2 = this.b;
        wjw wjw;
        if (backstagePollEditorView.getChildCount() - 1 > backstagePollEditorView.b.d) {
            backstagePollEditorView.removeView(view2);
            xpr.a(backstagePollEditorView.c, true);
            wjw = backstagePollEditorView.a;
            if (wjw != null) {
                wjw.b();
                return;
            }
            return;
        }
        backstagePollEditorView.b();
        wjw = backstagePollEditorView.a;
        if (wjw != null) {
            wjw.a();
        }
    }
}
