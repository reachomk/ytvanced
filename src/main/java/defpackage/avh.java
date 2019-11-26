package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: avh */
public abstract class avh extends BaseAdapter implements Filterable, avl {
    private avi a;
    public boolean b = false;
    public final boolean c = true;
    public Cursor d = null;
    public final Context e;
    public int f;
    public final avg g;
    public final DataSetObserver h;

    public avh(Context context) {
        this.e = context;
        this.f = -1;
        this.g = new avg(this);
        this.h = new avj(this);
    }

    public Cursor a(CharSequence charSequence) {
        throw null;
    }

    public abstract View a(ViewGroup viewGroup);

    public void a(Cursor cursor) {
        throw null;
    }

    public abstract void a(View view, Cursor cursor);

    public View b(ViewGroup viewGroup) {
        throw null;
    }

    public CharSequence b(Cursor cursor) {
        throw null;
    }

    public boolean hasStableIds() {
        return true;
    }

    public final Cursor a() {
        return this.d;
    }

    public final int getCount() {
        if (this.b) {
            Cursor cursor = this.d;
            if (cursor != null) {
                return cursor.getCount();
            }
        }
        return 0;
    }

    public final Object getItem(int i) {
        if (this.b) {
            Cursor cursor = this.d;
            if (cursor != null) {
                cursor.moveToPosition(i);
                return this.d;
            }
        }
        return null;
    }

    public final long getItemId(int i) {
        if (this.b) {
            Cursor cursor = this.d;
            if (cursor != null && cursor.moveToPosition(i)) {
                return this.d.getLong(this.f);
            }
        }
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.d.moveToPosition(i)) {
            if (view == null) {
                view = a(viewGroup);
            }
            a(view, this.d);
            return view;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("couldn't move cursor to position ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.b) {
            return null;
        }
        this.d.moveToPosition(i);
        if (view == null) {
            view = b(viewGroup);
        }
        a(view, this.d);
        return view;
    }

    public final Filter getFilter() {
        if (this.a == null) {
            this.a = new avi(this);
        }
        return this.a;
    }
}
