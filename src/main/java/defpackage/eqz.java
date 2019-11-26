package defpackage;

import android.support.design.textfield.TextInputLayout;
import com.google.android.apps.youtube.app.common.rendering.presenter.donationshelf.PrefixedEditText;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: eqz */
public final class eqz {
    public final YouTubeTextView a;
    public final TextInputLayout b;
    public final PrefixedEditText c;
    public final erb d = new erb(this);
    public eqy e;
    public aqxj f;

    public eqz(YouTubeTextView youTubeTextView, TextInputLayout textInputLayout) {
        this.a = youTubeTextView;
        this.b = textInputLayout;
        this.c = (PrefixedEditText) textInputLayout.findViewById(R.id.custom_amount_edit);
    }
}
