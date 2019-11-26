package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import com.google.android.apps.youtube.app.ui.SubtitlesColorListPreference;
import com.google.android.youtube.R;

/* renamed from: jod */
public final class jod extends ArrayAdapter {
    private int a = 0;
    private final /* synthetic */ SubtitlesColorListPreference b;

    public jod(SubtitlesColorListPreference subtitlesColorListPreference, Context context, CharSequence[] charSequenceArr, int i) {
        this.b = subtitlesColorListPreference;
        super(context, R.layout.subtitles_color_list_preference_entry, charSequenceArr);
        this.a = i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(this.b.a).inflate(R.layout.subtitles_color_list_preference_entry, viewGroup, false);
        int[] iArr = this.b.b;
        if (iArr != null && iArr.length > i) {
            if (iArr[i] == 0) {
                view.findViewById(R.id.preview).setBackgroundResource(R.drawable.pref_subtitles_none);
            } else {
                view.findViewById(R.id.preview).setBackgroundColor(this.b.b[i]);
            }
        }
        CheckedTextView checkedTextView = (CheckedTextView) view.findViewById(R.id.checked_text);
        checkedTextView.setText((CharSequence) getItem(i));
        if (i == this.a) {
            checkedTextView.setChecked(true);
        }
        return view;
    }
}
