package defpackage;

/* renamed from: anht */
final class anht extends anho {
    private anht() {
    }

    /* Access modifiers changed, original: final */
    public final void a(ania ania, Thread thread) {
        ania.thread = thread;
    }

    /* Access modifiers changed, original: final */
    public final void a(ania ania, ania ania2) {
        ania.next = ania2;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(anhl anhl, ania ania, ania ania2) {
        synchronized (anhl) {
            if (anhl.waiters == ania) {
                anhl.waiters = ania2;
                return true;
            }
            return false;
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a(anhl anhl, anhs anhs, anhs anhs2) {
        synchronized (anhl) {
            if (anhl.listeners == anhs) {
                anhl.listeners = anhs2;
                return true;
            }
            return false;
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a(anhl anhl, Object obj, Object obj2) {
        synchronized (anhl) {
            if (anhl.value == obj) {
                anhl.value = obj2;
                return true;
            }
            return false;
        }
    }

    /* synthetic */ anht(byte b) {
    }
}
