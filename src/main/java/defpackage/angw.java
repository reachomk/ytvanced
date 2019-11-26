package defpackage;

/* renamed from: angw */
public final class angw {
    public static angp a(Throwable th) {
        angp angp = (angp) angq.e.createBuilder();
        String name = th.getClass().getName();
        angp.copyOnWrite();
        angq angq = (angq) angp.instance;
        angq.a |= 1;
        angq.b = name;
        if (th.getMessage() != null) {
            name = th.getMessage();
            angp.copyOnWrite();
            angq = (angq) angp.instance;
            if (name != null) {
                angq.a |= 2;
                angq.c = name;
            } else {
                throw new NullPointerException();
            }
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                angr angr = (angr) angs.f.createBuilder();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    angr.copyOnWrite();
                    angs angs = (angs) angr.instance;
                    if (className != null) {
                        angs.a |= 1;
                        angs.b = className;
                        className = stackTraceElement.getMethodName();
                        angr.copyOnWrite();
                        angs = (angs) angr.instance;
                        if (className != null) {
                            angs.a |= 2;
                            angs.c = className;
                            int lineNumber = stackTraceElement.getLineNumber();
                            angr.copyOnWrite();
                            angs = (angs) angr.instance;
                            angs.a |= 8;
                            angs.e = lineNumber;
                            if (stackTraceElement.getFileName() != null) {
                                String fileName = stackTraceElement.getFileName();
                                angr.copyOnWrite();
                                angs angs2 = (angs) angr.instance;
                                if (fileName != null) {
                                    angs2.a |= 4;
                                    angs2.d = fileName;
                                } else {
                                    throw new NullPointerException();
                                }
                            }
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
                angp.copyOnWrite();
                angq angq2 = (angq) angp.instance;
                if (!angq2.d.a()) {
                    angq2.d = anxl.mutableCopy(angq2.d);
                }
                angq2.d.add((angs) ((anxl) angr.build()));
            }
        }
        return angp;
    }
}
