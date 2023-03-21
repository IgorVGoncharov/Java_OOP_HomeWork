package GeoTree;

public enum Relationship {
    parent {
        public Relationship getConnection() {
            return children;
        }
    },
    children{
        public Relationship getConnection() {
            return parent;
        }
    },
    brother {
        public Relationship getConnection() {
            return sister;
        }
    },
    sister {
        public Relationship getConnection() {
            return brother;
        }
    },
    husband {
        public Relationship getConnection() {
            return wife;
        }
    },
    wife {
        public Relationship getConnection() {
            return husband;
        }
    };

    public abstract Relationship getConnection();
}
