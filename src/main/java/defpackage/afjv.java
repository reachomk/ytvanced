package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/* renamed from: afjv */
public abstract class afjv extends Observable implements amro {
    private final ArrayList a = new ArrayList();

    public final synchronized void addObserver(Observer observer) {
        amqw.a((Object) observer);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            Observer observer2 = (Observer) ((WeakReference) it.next()).get();
            if (observer2 == null) {
                it.remove();
            } else if (observer2.equals(observer)) {
                return;
            }
        }
        this.a.add(new WeakReference(observer));
    }

    public final synchronized void deleteObserver(Observer observer) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            Observer observer2 = (Observer) ((WeakReference) it.next()).get();
            if (observer2 == null) {
                it.remove();
            } else if (observer2.equals(observer)) {
                it.remove();
                return;
            }
        }
    }

    public final void notifyObservers(Object obj) {
        ArrayList arrayList = new ArrayList(this.a.size());
        synchronized (this) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                Observer observer = (Observer) ((WeakReference) it.next()).get();
                if (observer == null) {
                    it.remove();
                } else {
                    arrayList.add(observer);
                }
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Observer) arrayList.get(i)).update(this, obj);
        }
    }

    public final synchronized void deleteObservers() {
        this.a.clear();
    }

    public final synchronized int countObservers() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == null) {
                it.remove();
            }
        }
        return this.a.size();
    }
}
