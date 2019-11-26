package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: aknw */
public final class aknw extends akna {
    private final SparseArray b = new SparseArray(16);

    /* Access modifiers changed, original: protected|final */
    public final akot a(int i) {
        return (akot) c(i).poll();
    }

    public final void a(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            view.getContext();
            afpc.a(2, afpf.crash, "View must not have a parent when recycled.");
            if (parent instanceof ViewGroup) {
                if (parent instanceof RecyclerView) {
                    afpc.a(2, afpf.crash, "Cannot call removeView on a RecyclerView parent.");
                } else {
                    ((ViewGroup) parent).removeView(view);
                }
            }
        }
        int b = akoz.b(view);
        akot a = akoz.a(view);
        if (b != -1 && a != null) {
            akoz.a(a, (akpb) this);
            c(b).offer(a);
        }
    }

    private final Queue c(int i) {
        Queue queue = (Queue) this.b.get(i);
        if (queue != null) {
            return queue;
        }
        LinkedList linkedList = new LinkedList();
        this.b.put(i, linkedList);
        return linkedList;
    }
}
