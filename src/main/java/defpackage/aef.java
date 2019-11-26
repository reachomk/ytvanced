package defpackage;

import android.content.Context;
import android.widget.ArrayAdapter;

/* renamed from: aef */
final class aef extends ArrayAdapter {
    public aef(Context context, int i) {
        super(context, i, 16908308, null);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final boolean hasStableIds() {
        return true;
    }
}
