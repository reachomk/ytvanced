package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.google.android.youtube.R;
import defpackage.bdu;

public class DropDownPreference extends ListPreference {
    private final Context k;
    private final ArrayAdapter l = new ArrayAdapter(this.k, 17367049);

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        bdu bdu = new bdu(this);
        this.k = context;
        this.l.clear();
        CharSequence[] charSequenceArr = this.a;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.l.add(charSequence.toString());
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        Spinner spinner = null;
        spinner.performClick();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        ArrayAdapter arrayAdapter = this.l;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
