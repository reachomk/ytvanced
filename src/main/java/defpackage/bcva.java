package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: bcva */
public final class bcva {
    public static RuntimeException a(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new RuntimeException(th);
        }
    }

    public static void b(Throwable th) {
        if (th instanceof bcve) {
            throw ((bcve) th);
        } else if (th instanceof bcvf) {
            throw ((bcvf) th);
        } else if (th instanceof bcvc) {
            throw ((bcvc) th);
        } else if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static void a(List list) {
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                Throwable th = (Throwable) list.get(0);
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                } else if (th instanceof Error) {
                    throw ((Error) th);
                } else {
                    throw new RuntimeException(th);
                }
            }
            throw new bcux((Collection) list);
        }
    }

    public static void a(Throwable th, bcud bcud, Object obj) {
        bcva.b(th);
        bcud.a(bcvh.a(th, obj));
    }

    public static void a(Throwable th, bcud bcud) {
        bcva.b(th);
        bcud.a(th);
    }
}
