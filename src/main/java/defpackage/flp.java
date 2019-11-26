package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: flp */
final class flp extends aaj {
    private final /* synthetic */ fln b;

    public final void a(View view, aca aca) {
        super.a(view, aca);
        boolean z = true;
        aca.a(true);
        if (this.b.b.getSelectedItem() != ((flo) view.getTag()).c) {
            z = false;
        }
        aca.b(z);
        String charSequence = ((TextView) view.findViewById(R.id.label)).getText().toString();
        String charSequence2 = ((TextView) view.findViewById(R.id.description)).getText().toString();
        charSequence = String.valueOf(charSequence);
        charSequence2 = String.valueOf(charSequence2);
        aca.d(charSequence2.length() == 0 ? new String(charSequence) : charSequence.concat(charSequence2));
    }

    /* synthetic */ flp(fln fln) {
        this.b = fln;
    }
}
