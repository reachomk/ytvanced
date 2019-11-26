package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: bik */
public abstract class bik {
    public final DataSetObservable a = new DataSetObservable();
    private DataSetObserver b;

    public Object a(ViewGroup viewGroup, int i) {
        throw null;
    }

    public void a() {
    }

    public void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void a(ViewGroup viewGroup) {
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        throw null;
    }

    public void a(Object obj) {
    }

    public abstract boolean a(View view, Object obj);

    public int b(Object obj) {
        return -1;
    }

    public Parcelable b() {
        return null;
    }

    public CharSequence b(int i) {
        return null;
    }

    public abstract int c();

    public final void d() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.a.notifyChanged();
    }

    public final void a(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }
}
