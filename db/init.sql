CREATE TABLE IF NOT EXISTS profiles (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    nickname VARCHAR(255) NOT NULL,
    age INTEGER NOT NULL,
    school VARCHAR(255) NOT NULL,
    major VARCHAR(255) NOT NULL,
    hobby VARCHAR(255) NOT NULL,
    quote VARCHAR(255) NOT NULL
);

INSERT INTO profiles (name, nickname, age, school, major, hobby, quote)
SELECT
    'Nguyễn Sỹ Phúc',
    'Phúc',
    21,
    'Trường Đại Học Công Nghệ TP.HCM (HUTECH)',
    'Cong nghe phan mem',
    'Lap trinh, nghe nhac, da bong',
    'Code moi ngay, tien bo moi ngay!'
WHERE NOT EXISTS (SELECT 1 FROM profiles);
