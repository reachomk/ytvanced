package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uev */
public final class uev implements Externalizable {
    public static final long serialVersionUID = 1;
    public final List a = new ArrayList();

    public final void writeExternal(ObjectOutput objectOutput) {
        int size = this.a.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((ues) this.a.get(i)).writeExternal(objectOutput);
        }
    }

    public final void readExternal(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            ues ues = new ues();
            ues.readExternal(objectInput);
            this.a.add(ues);
        }
    }
}
