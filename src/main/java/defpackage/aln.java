package defpackage;

import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: aln */
public final class aln implements ListAdapter, SpinnerAdapter {
    private final SpinnerAdapter a;
    private ListAdapter b;

    public aln(SpinnerAdapter spinnerAdapter, Theme theme) {
        this.a = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.b = (ListAdapter) spinnerAdapter;
        }
        if (theme == null) {
            return;
        }
        if (VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
            ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        } else if (spinnerAdapter instanceof arw) {
            arw arw = (arw) spinnerAdapter;
            if (arw.b() == null) {
                arw.a();
            }
        }
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.a;
        return spinnerAdapter != null ? spinnerAdapter.getCount() : 0;
    }

    public final Object getItem(int i) {
        SpinnerAdapter spinnerAdapter = this.a;
        return spinnerAdapter != null ? spinnerAdapter.getItem(i) : null;
    }

    public final long getItemId(int i) {
        SpinnerAdapter spinnerAdapter = this.a;
        return spinnerAdapter != null ? spinnerAdapter.getItemId(i) : -1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.a;
        return spinnerAdapter != null ? spinnerAdapter.getDropDownView(i, view, viewGroup) : null;
    }

    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.a;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.b;
        if (listAdapter == null) {
            return true;
        }
        return listAdapter.areAllItemsEnabled();
    }

    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.b;
        if (listAdapter == null) {
            return true;
        }
        return listAdapter.isEnabled(i);
    }

    public final boolean isEmpty() {
        return getCount() == 0;
    }
}
