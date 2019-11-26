package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

/* renamed from: atc */
final class atc implements aps {
    private final /* synthetic */ ata a;

    atc(ata ata) {
        this.a = ata;
    }

    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.a.u.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        atk atk = null;
        ata ata;
        if (actionMasked == 0) {
            this.a.k = motionEvent.getPointerId(0);
            this.a.c = motionEvent.getX();
            this.a.d = motionEvent.getY();
            this.a.b();
            ata = this.a;
            if (ata.b == null) {
                if (!ata.n.isEmpty()) {
                    View a = ata.a(motionEvent);
                    for (int size = ata.n.size() - 1; size >= 0; size--) {
                        atk atk2 = (atk) ata.n.get(size);
                        if (atk2.e.a == a) {
                            atk = atk2;
                            break;
                        }
                    }
                }
                if (atk != null) {
                    ata = this.a;
                    ata.c -= atk.i;
                    ata.d -= atk.j;
                    ata.a(atk.e, true);
                    if (this.a.a.remove(atk.e.a)) {
                        atg.b(atk.e);
                    }
                    this.a.a(atk.e, atk.f);
                    ata = this.a;
                    ata.a(motionEvent, ata.m, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            ata = this.a;
            ata.k = -1;
            ata.a(null, 0);
        } else {
            int i = this.a.k;
            if (i != -1 && motionEvent.findPointerIndex(i) >= 0) {
                this.a.a(actionMasked);
            }
        }
        VelocityTracker velocityTracker = this.a.r;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return this.a.b != null;
    }

    public final void a(MotionEvent motionEvent) {
        this.a.u.a(motionEvent);
        VelocityTracker velocityTracker = this.a.r;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (this.a.k != -1) {
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(this.a.k);
            if (findPointerIndex >= 0) {
                this.a.a(actionMasked);
            }
            ata ata = this.a;
            aqj aqj = ata.b;
            if (aqj != null) {
                int i = 0;
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            VelocityTracker velocityTracker2 = ata.r;
                            if (velocityTracker2 != null) {
                                velocityTracker2.clear();
                            }
                        } else if (actionMasked == 6) {
                            actionMasked = motionEvent.getActionIndex();
                            int pointerId = motionEvent.getPointerId(actionMasked);
                            ata ata2 = this.a;
                            if (pointerId == ata2.k) {
                                if (actionMasked == 0) {
                                    i = 1;
                                }
                                ata2.k = motionEvent.getPointerId(i);
                                ata ata3 = this.a;
                                ata3.a(motionEvent, ata3.m, actionMasked);
                            }
                        }
                    } else if (findPointerIndex >= 0) {
                        ata.a(motionEvent, ata.m, findPointerIndex);
                        this.a.a(aqj);
                        ata ata4 = this.a;
                        ata4.p.removeCallbacks(ata4.q);
                        this.a.q.run();
                        this.a.p.invalidate();
                    }
                    return;
                }
                this.a.a(null, 0);
                this.a.k = -1;
            }
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.a.a(null, 0);
        }
    }
}
