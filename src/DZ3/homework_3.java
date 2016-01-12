package DZ3;
import java.util.Set;
import java.util.HashSet;
/**
 * Created by Виктор on 12.01.2016.
 */
public class homework_3 {

        // uml диаграмма 1
        public abstract class File {
        }

        public class Audiofile extends File {
        }

        public class Imagefile extends File {
        }

        public class Textfile extends File {
        }

        public class Directory {
            Set<File> file = new HashSet<File>();
        }
        // uml диаграмма 2

        public abstract class Flower {
        }

        public class Rose extends Flower {
        }

        public class Chamomile extends Flower {
        }

        public class Aster extends Flower {
        }

        public class Tulip extends Flower {
        }

        public class KustRose {
        }

        public class Bouqet {
            Set<Flower> flower = new HashSet<Flower>();


            // uml диаграмма 3
            public abstract class Instrument {
            }

            public class Guitar extends Instrument {
            }

            public class Piano extends Instrument {
            }

            public class Trumpet extends Instrument {
            }

            public class MusicShop {
                Set<Instrument> instrument = new HashSet<Instrument>();
            }
        }
    }
