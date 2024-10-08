package faang.school.projectservice.service.filter.vacancy;

import faang.school.projectservice.dto.filter.VacancyFilterDto;
import faang.school.projectservice.model.Vacancy;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Stream;

@Component
public class VacancyPositionFilter implements VacancyFilter {
    @Override
    public boolean isApplicable(VacancyFilterDto filters) {
        return filters.getPositionPattern() != null;
    }

    @Override
    public List<Vacancy> apply(Stream<Vacancy> vacancyStream, VacancyFilterDto filters) {
        return vacancyStream
                .filter(vacancy -> vacancy.getPosition().equals(filters.getPositionPattern()))
                .toList();
    }
}
