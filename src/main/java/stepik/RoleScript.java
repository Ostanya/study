package stepik;

public class RoleScript {

    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder builder = new StringBuilder(); //создаем новую строку
        for (int i = 0; i < roles.length; i++) { //проходим по массиву ролей
            builder.append(roles[i]).append(":\n"); //ищем роль и добавляем в новую строку/после каждой роли ставим двоеточие и переход строки
            for (int j = 0; j < textLines.length; j++) { //проходим по массиву такста
                if (textLines[j].startsWith(roles[i].concat(":"))) { //если текст начинаеться с роли то обединяем их на двоеточии
                    builder.append(j + 1).append(") ").append(textLines[j].substring(textLines[j].indexOf(":") + 2)) //добавляем в строку с пробелом прохорашиваем вид и нумерацию строк
                            .append("\n");
                }
            }
            builder.append("\n");
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        String [] roles = {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines = { "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(new RoleScript().printTextPerRole(roles, textLines));;
    }
}
