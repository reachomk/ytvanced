package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: bei */
final class bei implements y {
    private final ben a;

    bei(ben ben) {
        this.a = ben;
    }

    public final void a(af afVar, aa aaVar) {
        StringBuilder stringBuilder;
        if (aaVar == aa.ON_CREATE) {
            afVar.y_().b(this);
            bek S_ = this.a.S_();
            if (S_.c) {
                Bundle bundle = S_.b;
                if (bundle == null) {
                    bundle = null;
                } else {
                    String str = "androidx.savedstate.Restarter";
                    bundle = bundle.getBundle(str);
                    S_.b.remove(str);
                    if (S_.b.isEmpty()) {
                        S_.b = null;
                    }
                }
                if (bundle != null) {
                    ArrayList stringArrayList = bundle.getStringArrayList("classes_to_restore");
                    if (stringArrayList != null) {
                        int size = stringArrayList.size();
                        int i = 0;
                        while (i < size) {
                            String str2 = (String) stringArrayList.get(i);
                            try {
                                Class asSubclass = Class.forName(str2, false, bei.class.getClassLoader()).asSubclass(bem.class);
                                try {
                                    asSubclass = asSubclass.getDeclaredConstructor(new Class[0]);
                                    asSubclass.setAccessible(true);
                                    try {
                                        ((bem) asSubclass.newInstance(new Object[0])).a();
                                        i++;
                                    } catch (Exception e) {
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("Failed to instantiate ");
                                        stringBuilder.append(str2);
                                        throw new RuntimeException(stringBuilder.toString(), e);
                                    }
                                } catch (NoSuchMethodException e2) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Class");
                                    stringBuilder.append(asSubclass.getSimpleName());
                                    stringBuilder.append(" must have default constructor in order to be automatically recreated");
                                    throw new IllegalStateException(stringBuilder.toString(), e2);
                                }
                            } catch (ClassNotFoundException e3) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Class ");
                                stringBuilder.append(str2);
                                stringBuilder.append(" wasn't found");
                                throw new RuntimeException(stringBuilder.toString(), e3);
                            }
                        }
                        return;
                    }
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                return;
            }
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
