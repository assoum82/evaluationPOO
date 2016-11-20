/**
 * Created by chawki on 20/11/16.
 */
public enum Direction {
    None,

    Nord {
        @Override
        public String toString() {
            return "Nord";
        }
    },
    Est {
        @Override
        public String toString() {
            return "Est";
        }
    },
    Sud {
        @Override
        public String toString() {
            return "Sud";
        }
    },
    Ouest {
        @Override
        public String toString() {
            return "Ouest";
        }
    }


}
