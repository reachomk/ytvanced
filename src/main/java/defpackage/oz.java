package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: oz */
final class oz extends pc {
    oz() {
    }

    public final boolean a(Object obj) {
        return obj instanceof Transition;
    }

    public final Object b(Object obj) {
        return obj != null ? ((Transition) obj).clone() : null;
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public final void a(Object obj, View view, ArrayList arrayList) {
        obj = (TransitionSet) obj;
        List targets = obj.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            pc.a(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        a(obj, arrayList);
    }

    public final void a(Object obj, View view) {
        if (view != null) {
            Transition transition = (Transition) obj;
            Rect rect = new Rect();
            pc.a(view, rect);
            transition.setEpicenterCallback(new oy(rect));
        }
    }

    public final void a(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            int transitionCount;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    a(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!oz.a(transition) && pc.a(transition.getTargets())) {
                transitionCount = arrayList.size();
                while (i < transitionCount) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    private static boolean a(Transition transition) {
        return (pc.a(transition.getTargetIds()) && pc.a(transition.getTargetNames()) && pc.a(transition.getTargetTypes())) ? false : true;
    }

    public final Object a(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    public final void b(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new pb(view, arrayList));
    }

    public final void a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public final void a(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new pa(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public final void a(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        obj = (TransitionSet) obj;
        if (obj != null) {
            obj.getTargets().clear();
            obj.getTargets().addAll(arrayList2);
            b(obj, arrayList, arrayList2);
        }
    }

    public final void b(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        int transitionCount;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                b(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!oz.a(transition)) {
            List targets = transition.getTargets();
            if (targets != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                transitionCount = arrayList2 != null ? arrayList2.size() : 0;
                while (i < transitionCount) {
                    transition.addTarget((View) arrayList2.get(i));
                    i++;
                }
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        transition.removeTarget((View) arrayList.get(size));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    public final void c(Object obj, View view) {
        ((Transition) obj).removeTarget(view);
    }

    public final void a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new pd(rect));
        }
    }
}
