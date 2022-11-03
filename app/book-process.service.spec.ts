import { TestBed } from '@angular/core/testing';

import { BookProcessService } from './book-process.service';

describe('BookProcessService', () => {
  let service: BookProcessService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BookProcessService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
