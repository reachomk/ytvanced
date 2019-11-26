package com.google.android.libraries.youtube.comment.ui;

import android.content.Context;
import android.support.design.bottomsheet.BottomSheetBehavior;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.youtube.R;
import defpackage.aux;
import defpackage.auy;

public final class UserMentionSuggestionsOverscrollBehavior extends aux {
    private boolean a;
    private int b;
    private int c;
    private int d = -1;

    public UserMentionSuggestionsOverscrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        aux aux = ((auy) view2.getLayoutParams()).a;
        if ((view instanceof ScrollView) && (aux instanceof BottomSheetBehavior)) {
            EditText editText = (EditText) coordinatorLayout.findViewById(R.id.content);
            int selectionStart = editText.getSelectionStart();
            Layout layout = editText.getLayout();
            if (layout != null) {
                selectionStart = layout.getLineForOffset(selectionStart);
                int lineBaseline = layout.getLineBaseline(selectionStart) + layout.getLineAscent(selectionStart);
                View findViewById = coordinatorLayout.findViewById(R.id.filler_space);
                LayoutParams layoutParams = findViewById.getLayoutParams();
                BottomSheetBehavior b = BottomSheetBehavior.b(view2);
                int top = view2.getTop();
                if (b.k != 5) {
                    int scrollY;
                    if (!this.a) {
                        scrollY = view.getScrollY();
                        this.c = scrollY;
                        this.b = ((editText.getTop() + lineBaseline) - (scrollY - ((int) view.getY()))) + (editText.getLineHeight() * 3);
                        this.a = true;
                    }
                    if (top < this.b) {
                        int i = this.d;
                        if (i == -1) {
                            i = findViewById.getHeight();
                            this.d = i;
                        }
                        scrollY = this.b - top;
                        i += scrollY;
                        if (findViewById.getHeight() != i) {
                            layoutParams.height = i;
                            findViewById.requestLayout();
                            view.scrollTo(0, this.c + scrollY);
                            view.setVerticalScrollBarEnabled(false);
                        }
                    } else if (this.d >= 0) {
                        this.d = -1;
                        layoutParams.height = 0;
                        findViewById.requestLayout();
                        view.setVerticalScrollBarEnabled(true);
                    }
                    return false;
                }
                this.a = false;
            }
        }
        return false;
    }
}
